package com.indiabixinheritance;


class a{
	void print() {
		System.out.println("hello");
	}
}
class b extends a{
	void display() {
		System.out.println("sarika");
	}
}
public class singleInheritance {

	public static void main(String[] args) {
		b obj=new b();
		obj.print();
		obj.display();

	}

}
