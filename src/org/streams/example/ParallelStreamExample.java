package org.streams.example;

import org.streams.data.StudentsDataForParallelExample;
import org.streams.entity.Student;

import java.util.List;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class ParallelStreamExample {

	public static void main(String[] args) {
		List<Student> students = StudentsDataForParallelExample.studentList;
		double bestGpa = students
		     .parallelStream()
		     .filter(s -> (s.getGraduationYear() == Student.THIS_YEAR))
		     .mapToDouble(s -> s.getGpa())
		     .max().getAsDouble();
		System.out.println(bestGpa);
	}

}
