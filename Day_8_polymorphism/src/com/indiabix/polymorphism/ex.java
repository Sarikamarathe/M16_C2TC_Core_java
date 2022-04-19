package com.indiabix.polymorphism;
class A
{
	void add() 
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);

	}
	void add(int x,int y) 
	{
		int c;
		c=x+y;
		System.out.println(c);

	}
	void add(int x,double y) 
	{
		double c;
		c=x+y;
		System.out.println(c);

	}
}
public class ex {

	public static void main(String[] args) {
		A a=new A();
		a.add();
		a.add(100, 200);
		a.add(10,23.14);
	}

}
	