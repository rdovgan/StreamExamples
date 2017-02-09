package org.streams.entity;

import java.util.Random;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class Game {

	private static Random random = new Random();

	public static class PlayerPoints {
		public final String name;
		public final long points;

		public PlayerPoints(String name, long points) {
			this.name = name;
			this.points = points;
		}

		public String toString() {
			return name + ":" + points;
		}
	}

	public static long getPoints(final String name) {
		return random.nextInt(100);
	}

}
