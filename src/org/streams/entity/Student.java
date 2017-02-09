package org.streams.entity;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class Student {

	public static final int THIS_YEAR = 2017;

	private String name;
	private int graduationYear;
	private double gpa;

	public Student(String name, int graduationYear, double gpa) {
		this.name = name;
		this.graduationYear = graduationYear;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
