package com.indiabixInterface;

interface mother 
{
	void diplay();
	
}

interface father
{
	void diplay1();
	
}
abstract class Daughter implements mother,father
{
	public void display1()
	{
		System.out.println("mother");
	}
	public void display()
	{
		System.out.println("father");
	}

public static void main(String args[])
{
	Daughter d=new Daughter();
	}
}
