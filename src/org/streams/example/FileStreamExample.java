package org.streams.example;

import org.streams.data.FileStreamData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by rdovgan on 08.02.2017.
 */
public class FileStreamExample {

	private static void outputFileWithStream() {
		try (FileReader fr = new FileReader(FileStreamData.FILE_NAME); BufferedReader br = new BufferedReader(fr)) {
			br.lines().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void outputLinesWithFilter(String filter) {
		try (FileReader fr = new FileReader(FileStreamData.FILE_NAME); BufferedReader br = new BufferedReader(fr)) {
			br.lines().filter(f -> f.toLowerCase().contains(filter)).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		outputFileWithStream();
		System.out.println("\n\n");
		outputLinesWithFilter(" line");
	}

}
