package com.indiabix.absract;

class parent1
{
	void accept() {
		System.out.println("parent-1");
	}
}
class child1 extends parent1
{
	void accept() {
		System.out.println("child-1");
	}
	void display() {
		super.accept();
		accept();
	}
}
public class superKeyword {

	public static void main(String[] args) {
		child1 c=new child1();
		c.display();

	}

}
