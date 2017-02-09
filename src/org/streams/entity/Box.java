package org.streams.entity;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class Box {

	private static int counter;

	public Box() {
		counter++;
	}

	public static int getCounter() {
		return counter;
	}

}
