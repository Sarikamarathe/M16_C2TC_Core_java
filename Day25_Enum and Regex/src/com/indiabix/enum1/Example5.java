package com.indiabix.enum1;

public class Example5 
{
	enum Emptype
    {
    	Contract,Permanat,Temporary;
    }
	static void print(Emptype e)
	{
		if(e==Emptype.Permanat)
		{
			System.out.println("Permanat Employee");
		}
		else if(e==Emptype.Contract)
		{
			System.out.println("Cntract-base Employee");

		}
		else
		{
			System.out.println("Temporary Employee");

		}
	}
	public static void main(String[] args) {
		Emptype e=Emptype.Temporary;
		print(e);
	}

}
