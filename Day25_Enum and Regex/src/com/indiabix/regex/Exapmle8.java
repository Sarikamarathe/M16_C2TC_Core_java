package com.indiabix.regex;

import java.util.Scanner;

public class Exapmle8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="M1-16 @@ Sarika Marathe @@Komal@@Jayu";
		String[] res=str.split("@@");
		for(String i:res)
		{
			System.out.println(i);
		}
	}

}
