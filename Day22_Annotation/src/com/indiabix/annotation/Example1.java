package com.indiabix.annotation;
class A
{
	void display()
	{
		System.out.println("Parent class");
	}
	
}
class B extends A
{
	void display()
	{
		System.out.println("Parent class");
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		B b=new B();
		b.display();
	}

}
