package com.indiabixWrapper;

import java.util.Scanner;

interface client
{
	void input();//by default public+static
	void output();
}
class raju implements client
{
	String name;
	int marks;
	public void input()
	{
		//String name;
		//int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		name=sc.nextLine();
		System.out.println("enter your marks:");
		marks=sc.nextInt();
	}
	public void output()
	{
		//String name;
		System.out.println("name:"+name);
		System.out.println("marks:"+marks);

	}
}
public interface inre {
	public static void main(String args[])
	{
		client c=new raju();
		c.input();
		c.output();
	}
}
