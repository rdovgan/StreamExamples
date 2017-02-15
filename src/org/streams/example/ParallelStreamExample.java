package org.streams.example;

import org.streams.data.StudentsDataForParallelExample;
import org.streams.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class ParallelStreamExample {

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8 };
		List<Integer> listOfIntegers =
				new ArrayList<>(Arrays.asList(intArray));
		System.out.println("Parallel stream");
		listOfIntegers
				.parallelStream()
				.forEach(e -> System.out.print(e + " "));
	}

}
