package org.streams.example;

import org.streams.entity.Box;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class InfiniteStreamExample {

	private static Random random = new Random();

	private static void generateBoxes() {
		System.out.println("Counter before generating: " + Box.getCounter());
		Stream<Box> stream = Stream.generate(() -> new Box()).limit(random.nextInt(1000));
		Box[] boxes = stream.toArray(Box[]::new);
		System.out.println("Counter after generating: " + Box.getCounter());
		System.out.println("Real box count: " + boxes.length);
	}

	private static void iterateValue() {
		Stream.iterate(1, i -> i + 1).limit(random.nextInt(100)).forEach(System.out::print);
	}

	public static void main(String[] args) {
		//generateBoxes();
		//iterateValue();
		//random.ints(1, 100).limit(100).forEach(i -> System.out.print(i + " "));
	}

}
