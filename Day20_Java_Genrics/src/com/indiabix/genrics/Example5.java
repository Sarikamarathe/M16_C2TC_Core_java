package com.indiabix.genrics;

public class Example5 
{
	public static <E>void print(E[] arr)
	{
		for(E itr:arr)
		{
			System.out.println(itr);
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Integer[] a= {11,22,33};
		Character[] b= {'x','y'};
		print(a);
		print(b);
;	}

}
