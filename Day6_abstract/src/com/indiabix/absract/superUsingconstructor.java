package com.indiabix.absract;

class parent4
{
	int marks;
	parent4()
	{
		System.out.println("parent-4");
	}
}
class child4 extends parent4
{
	child4()
	{
		super();
		System.out.println("child-4");

	}
}
public class superUsingconstructor {

	public static void main(String[] args) {
		child4 c=new child4();
	

	}

}
