package org.streams.data;

import org.streams.entity.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rdovgan on 10.02.2017.
 */
public class PersonData {

	public static List<Person> persons;

	static {
		persons = Arrays.asList(
				new Person("Max", 18),
				new Person("Peter", 23),
				new Person("Pamela", 23),
				new Person("David", 12));
	}

}
