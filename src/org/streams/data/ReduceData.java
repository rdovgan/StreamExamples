package org.streams.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class ReduceData {

	public static List<String> list = new ArrayList<>();

	static {
		list.add("java");
		list.add("php");
		list.add("python");
		list.add("perl");
		list.add("c");
		list.add("lisp");
		list.add("c#");
	}

	public static Stream<String> wordStream = list.stream();

}
