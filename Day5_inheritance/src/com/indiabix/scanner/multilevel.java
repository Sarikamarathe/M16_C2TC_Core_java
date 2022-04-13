package com.indiabix.scanner;

class A
{
	void print()
	{
		System.out.printf("this is class A");
	}
}
class B extends A
{
	void print1()
	{
		System.out.printf("\nthis is class B");

	}
}
class C extends B
{
	void print2()
	{
		System.out.printf("\nthis is class C");

	}
}
public class multilevel {
	public static void main(String args[]) {
		C c=new C();
		c.print();
		c.print1();
		c.print2();
	}


}
	