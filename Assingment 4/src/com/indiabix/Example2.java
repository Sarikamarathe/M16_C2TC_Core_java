package com.indiabix;

import java.util.Scanner;

public class Example2 {
	static int count(int m,int n)
	{
		
		if(n==1 || m==1) 
			
			return 1;
		
		return count(m-1,n)+count(n-1,m);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("m:");
		int m=sc.nextInt();
		System.out.print("n:");
		int n=sc.nextInt();
		System.out.println("Result:"+count(m,n));
	}


	
}
