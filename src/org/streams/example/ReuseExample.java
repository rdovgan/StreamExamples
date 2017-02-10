package org.streams.example;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by rdovgan on 10.02.2017.
 */
public class ReuseExample {

	public static void notReusableStream() {
		Stream<String> stream =
				Stream.of("d2", "a2", "b1", "b3", "c")
						.filter(s -> s.startsWith("b"));

		stream.anyMatch(s -> true);    // ok
		stream.noneMatch(s -> true);   // exception
	}

	public static void reusableStream() {
		Supplier<Stream<String>> streamSupplier =
				() -> Stream.of("d2", "a2", "b1", "b3", "c")
						.filter(s -> s.startsWith("a"));

		streamSupplier.get().anyMatch(s -> true);   // ok
		streamSupplier.get().noneMatch(s -> true);  // ok
	}

	public static void main(String[] args) {
		//notReusableStream();
		//reusableStream();
	}

}
