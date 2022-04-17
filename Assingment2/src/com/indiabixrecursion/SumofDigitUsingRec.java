package com.indiabixrecursion;

import java.util.Scanner;

public class SumofDigitUsingRec {
		public static int sum_of_digit(int n)
		{
			if(n==0)
			
				return 0;
			return(n%10 + sum_of_digit(n/10));
			
		}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int n=sc.nextInt();
		SumofDigitUsingRec s=new SumofDigitUsingRec();
		int result=sum_of_digit(n);
		System.out.println("sum of digit is:"+result);

	}
	
		
}

