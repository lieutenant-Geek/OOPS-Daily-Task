package com.copilot.daily.task;

public class Student {
	
	String name;
	int rollNumber;
	double marks;
	
	Student(String name, int rollno, double m)
	{
		this.name=name;
		this.rollNumber=rollno;
		this.marks=m;
	}
	
	public String calcGrade()
	{
		if(marks>=90)
			return "O";

		else if(marks>=80 && marks<90)
			return "A";
		
		else if(marks>=75 && marks<80)
			return "B";
		
		else if(marks>=60 && marks<75)
			return "C";
		
		else if(marks>=40 && marks < 60)
			return "D";
		
		else 
			return "F";
	}
	
	public void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Roll No:"+this.rollNumber);
		System.out.println("Marks: "+this.marks);
	}

}
