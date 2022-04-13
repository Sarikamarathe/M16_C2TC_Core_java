package com.indiabix.scanner;

import java.util.Scanner;

//Scanner example
public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("enter the name:");
		String str=sc.next();
		System.out.printf("enter the marks:");
		int i=sc.nextInt();
		sc.close();
	}

}
