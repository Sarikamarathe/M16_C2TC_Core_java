package com.indiabix.polymorphism;

class renault
{
	String color;
	int speed;
	renault()
	{
		System.out.println("ronault-RXE");
	}
	renault(String clr,int a)
	{
		color=clr;
		speed=a;
		System.out.println("color is" + clr + " speed is " + a + "km/hr");
	}
}
public class constructor {

	public static void main(String args[])
	{
		renault r=new renault();
		renault r1=new renault(" yellow", 50);
	}
}
