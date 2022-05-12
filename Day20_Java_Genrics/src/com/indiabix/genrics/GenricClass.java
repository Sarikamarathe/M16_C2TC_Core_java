package com.indiabix.genrics;

public class GenricClass<T> {
	T val;
	//T val1;
	void print()
	{
		System.out.println(val.getClass());
		//System.out.println(val1.getClass());
	}
	public static void main(String[] args) 
	{
		GenricClass<Integer>g=new GenricClass<>();
		//GenricClass<String>l=new GenricClass<>();
		g.val=11;
		//l.val1="sarika";
		g.print();
		//l.print();
	}

}
