package com.indiabix.javaintro;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no:");
		int a=sc.nextInt();
		System.out.println("No is:"+a);
		
		System.out.println("\nEnter Your name:");
		String b=sc.next();
		System.out.println("Name:"+b);
		
		System.out.println("\nEnter Division:");
		char ch=sc.next().charAt(0);
		System.out.println("Division:"+ch);
		
		System.out.println("\nEnter your Marks:");
		float f=sc.nextFloat();
		System.out.println("Marks:"+f);
		
		System.out.println("\nEnter Percentage:");
		double c=sc.nextDouble();
		System.out.println("Percentage:"+c);
		
		
	}
	
}
