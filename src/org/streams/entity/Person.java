package org.streams.entity;

/**
 * Created by rdovgan on 10.02.2017.
 */
public class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}
}