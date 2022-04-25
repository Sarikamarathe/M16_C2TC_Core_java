package com.indiabixexception;

import java.io.IOException;

class A
{
	void print(int num)throws ClassNotFoundException,IOException
	{
		if(num==1)
		{
			throw new IOException("Exception handled");
		}
		else
		{
			throw new ClassNotFoundException("Exception cooured and handled");
		}
	}
}
public class ex3 {

	public static void main(String[] args) {
		try
		{
		A a=new A();
		a.print(11);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
