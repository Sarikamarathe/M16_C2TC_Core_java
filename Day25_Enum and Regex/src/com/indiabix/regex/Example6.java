package com.indiabix.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Example6 {
	
	public static void main(String[] args) {
		String pattern="Sarika Marathe";
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
		sc.close();
	}

}
