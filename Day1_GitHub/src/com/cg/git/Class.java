package com.cg.git;

import java.util.Scanner;

public class Class {
		Scanner sc=new Scanner(System.in);
		String name;
		int marks;
		public void get_details() {
			System.out.printf("enter your name:");
			name=sc.next();
			System.out.printf("\nenter your marks:");
			marks=sc.nextInt();
		}
			public void show_details() {
				System.out.printf("name:"+name);
				System.out.printf("\nmarks:"+marks);

		}
		public static void main(String[] args) {
			Class c=new Class();
			c.get_details();
			c.show_details();
		}	
}


