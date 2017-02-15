package org.streams.example;

import java.util.stream.Stream;

/**
 * Created by rdovgan on 10.02.2017.
 */
public class ZMain {

	public static void test() {
		Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
			System.out.println("filter: " + s);
			return s.substring(0, 1).equals("b");
		});
	}

	public static void main(String[] args) {
		test();
	}
}
