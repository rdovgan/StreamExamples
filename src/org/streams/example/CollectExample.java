package org.streams.example;

import org.streams.data.PersonData;
import org.streams.entity.Person;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by rdovgan on 10.02.2017.
 */
public class CollectExample {

	public static void commonCollect() {
		List<Person> filtered =
				PersonData.persons
						.stream()
						.filter(p -> p.name.startsWith("P"))
						.collect(Collectors.toList());

		System.out.println(filtered);
	}

	public static void setCollect() {
		Map<Integer, List<Person>> personsByAge = PersonData.persons
			.stream()
			.collect(Collectors.groupingBy(p -> p.age));
		personsByAge
				.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
	}

	public static void average() {
		Double averageAge = PersonData.persons
				.stream()
				.collect(Collectors.averagingInt(p -> p.age));

		System.out.println(averageAge);
	}

	public static void sumAndCount() {
		IntSummaryStatistics ageSummary =
				PersonData.persons
						.stream()
						.collect(Collectors.summarizingInt(p -> p.age));

		System.out.println(ageSummary);
	}

	public static void joining() {
		String phrase = PersonData.persons
				.stream()
				.filter(p -> p.age >= 18)
				.map(p -> p.name)
				.collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

		System.out.println(phrase);
	}

	public static void main(String[] args) {
		commonCollect();
		setCollect();
		average();
		sumAndCount();
		joining();
	}

}
