package org.streams.example;

import org.streams.data.ArrayData;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class AToStreamExample {

	private static void rangeToStream() {
		IntStream.range(1, 15).forEach(System.out::println);
	}

	private static void intsToStream() {
		Stream<Integer> stream = Stream.of(2, 4, 5, 6, 7, 11, 13, 15, 17);
		stream.forEach(System.out::print);
	}

	private static void arrayToStream() {
		IntStream stream = Arrays.stream(ArrayData.integerArray);
		stream.forEach(System.out::print);
	}

	public static void main(String[] args) {
		//rangeToStream();
		//intsToStream();
		//arrayToStream();
	}

}
