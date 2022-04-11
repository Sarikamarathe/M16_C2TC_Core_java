package com.cg.git;

public class array {

	public static void main(String[] args) {
		int num=5;
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		System.out.println("enter first no:");

		for(int i=0;i<5;i++) {
			a[i]=i;
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("enter second no:");

		for(int i=0;i<5;i++) {
			b[i]=num;
			System.out.print(b[i]+" ");
			num++;
		}
		System.out.println();
		System.out.println("sum of no:");

			for(int i=0;i<5;i++) {
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
		

	}

}
