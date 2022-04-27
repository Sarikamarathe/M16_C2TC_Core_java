package com.indiabix.string;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="Dhoni";
		String str1="Kohli";
		//System.out.println(str);
		System.out.print("Input:");
		String str2=sc.nextLine();
		if(str.equals(str1))
		{
			System.out.println("matching");
		}
		else
		{
			System.out.print("Output:");
			System.out.print("Not matching");

		}
	}

}
