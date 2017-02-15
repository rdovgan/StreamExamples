package org.streams.example;

import org.streams.data.FileStreamData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by rdovgan on 08.02.2017.
 */
public class FileStreamExample {

	private static void outputFileWithBufferedReaderStream() {
		try (FileReader fr = new FileReader(FileStreamData.FILE_NAME); BufferedReader br = new BufferedReader(fr)) {
			br.lines().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void outputFileWithStream() {
		try (Stream st = Files.lines(Paths.get(FileStreamData.FILE_NAME))) {
			st.forEach(System.out::println);
			System.out.println("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void outputLinesWithFilter(String filter) {
		try (FileReader fr = new FileReader(FileStreamData.FILE_NAME); BufferedReader br = new BufferedReader(fr)) {
			br.lines().filter(f -> f.toLowerCase().contains(filter)).forEach(System.out::println);
			System.out.println("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//outputFileWithBufferedReaderStream();
		//outputFileWithStream();
		outputLinesWithFilter(" line");
	}

}
