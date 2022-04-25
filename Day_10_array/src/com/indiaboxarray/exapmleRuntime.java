package com.indiaboxarray;

import java.util.Scanner;

public class exapmleRuntime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
