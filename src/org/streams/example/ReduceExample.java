package org.streams.example;

import java.util.Optional;
import java.util.stream.Stream;

import static org.streams.data.ReduceData.wordStream;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class ReduceExample {

	public static void main(String[] args) {
		Stream<Integer> lengthStream = wordStream.map(s -> s.length());
		Optional<Integer> sum = lengthStream.reduce((x, y) -> x + y);
		sum.ifPresent(System.out::println);
	}

}
