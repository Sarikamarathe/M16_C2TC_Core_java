package com.indiabixexception;

public class Ex1 {

	public static void main(String[] args) {
		try
		{
			int x=12/0;
			System.out.println(x);
		}
		catch(Exception e)
		{
			
			System.out.println("Exception handled" +e);
		}
		finally
		{
			System.out.println("finally");
		}

	}

}
