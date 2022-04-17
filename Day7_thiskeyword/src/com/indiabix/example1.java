package com.indiabix;

import java.io.PrintStream;

class parent
{
	int a;
	void parent(int a)
	{
		this.a=a;
	}
	void display()
	{
		System.out.println("value of a is:"+a);
	}
	
	
}
public class example1 {

	public static void main(String[] args) {
		parent p=new parent();
		//p.print(10);
		p.display();

	}

}
