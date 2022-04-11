package com.cg.git;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.printf("enter the name:");
		String s_name=sc.next();
		System.out.printf("enter the marks:");
		int s_marks=sc.nextInt();
		
		studentobj s=new studentobj(s_name,s_marks);
		s.show_details();
		
		

	}

}
