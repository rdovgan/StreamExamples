package org.streams.example;

import org.streams.data.TextPattern;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class TextPatternExample {

	private static void changeAlphabet() {
		System.out.println(TextPattern.COMMA_SEPARATED_ALPHABET);
		System.out.println("\n");
		Pattern pattern = Pattern.compile(",");
		pattern.splitAsStream(TextPattern.COMMA_SEPARATED_ALPHABET).map(f -> f.equals("z") ? f : f + "-").forEach(System.out::print);
		System.out.println("\n");
	}

	private static void changeText(String filter) {
		System.out.println(TextPattern.TEXT_ABOUT_JAVA);
		Pattern pattern = Pattern.compile(filter);
		pattern.splitAsStream(TextPattern.TEXT_ABOUT_JAVA).forEach(f -> {
			String tempFilter = filter.replaceAll(".", "*");
			System.out.print(f + tempFilter);
		});
		System.out.println("\n");
	}

	private static void splitStringToStream() {
		String sentence = "Program creek is a Java site.";
		System.out.println(sentence);
		Stream<String> wordStream = Pattern.compile("\\W").splitAsStream(sentence);
		wordStream.forEach(System.out::print);
	}

	public static void main(String[] args) {
		//changeAlphabet();

		//changeText("the");
		//changeText("e");

		splitStringToStream();
	}

}
