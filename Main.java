package com.copilot.daily.task;

import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args)
	{
		
		ArrayList<Student> students = new ArrayList<>();

		
		students.add(new Student("Rohit", 2, 87.0));
		students.add(new Student("Atul", 3, 75.2));
		students.add(new Student("Rahul", 4, 83.4));

		
		for (Student s : students) {
		    s.display();
		    System.out.println("Grade: " + s.calcGrade());
		    System.out.println();
		}

		
	}

}
