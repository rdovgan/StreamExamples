package org.streams.data;

import org.streams.entity.Student;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class StudentsDataForParallelExample {

	public static List<Student> studentList = Arrays
			.asList(
					new Student("Good student", 2017, 4.9),
					new Student("So-so student", 2017, 3.7),
					new Student("Bad student", 2017, 2.4),

					new Student("Best student", 2016, 5),
					new Student("Soldier", 2016, 1.6),
					new Student("Mid student", 2017, 3.8),

					new Student("Good student in 2016", 2015, 4.9),
					new Student("So-so student in 2016", 2015, 3.7),
					new Student("Bad student in 2016", 2015, 2.4)
			);

}
