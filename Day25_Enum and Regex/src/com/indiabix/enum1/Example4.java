package com.indiabix.enum1;
interface Pizza
{
	void display();
	
		
	
}
enum Size implements Pizza
{
	small,medium,large,extralarge;

	@Override
	public void display() {
		System.out.println("Size is:" +this);

	}
}
public class Example4 {

	public static void main(String[] args) 
	{
		Size.large.display();
	}

}
