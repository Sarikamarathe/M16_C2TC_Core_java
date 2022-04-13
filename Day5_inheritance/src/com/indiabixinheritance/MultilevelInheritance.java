package com.indiabixinheritance;

class samsung
{
	void accept() {
		System.out.printf("this is samsung");
	}
}
class samsung2 extends samsung
{
	void display() {
		System.out.printf("\nthis is samsung2");

	}
}
class samsung3 extends samsung2
{
	void print() {
		System.out.printf("\nthis is samsung3");

	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		samsung3 s=new samsung3();
		s.accept();
		s.display();
		s.print();

	}

}
