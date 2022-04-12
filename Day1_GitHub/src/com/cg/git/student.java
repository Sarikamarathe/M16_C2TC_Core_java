package com.cg.git;

import java.util.Scanner;

public class student {
	
	String name=" ";
	int marks=0;
	
	public student(String n,int m) {
		name=n;
		marks=m;
	}
	public void display() {
		System.out.printf("Name:"+name);
		System.out.printf("\nMarks:"+marks);

	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.printf("enter the name:");
		String s_name=sc.next();
		System.out.printf("enter the marks:");
		int s_marks=sc.nextInt();
		
		student s=new student(s_name,s_marks);
		s.display();
		
		

	}

}
