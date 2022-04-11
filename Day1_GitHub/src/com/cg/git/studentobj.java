package com.cg.git;

import java.util.Scanner;

public class studentobj {

	String name=" ";
	int marks=0;
	
	public studentobj(String n,int m){
		name=n;
		marks=m;
		
}
	public void show_details() {
		System.out.printf("name of student:"+name);
		System.out.printf("\nmarks of student:"+marks);

	}
}
