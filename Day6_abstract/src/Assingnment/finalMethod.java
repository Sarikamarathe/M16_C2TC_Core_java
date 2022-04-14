package Assingnment;

class demo
{
	void print()
	{
		System.out.println("8946788939");
	}

	void ATMpin()
	{
		System.out.println("786");

	}
}
class test extends demo
{
	void print()
	{
		System.out.println("8946788939");
	}
	
	final void ATMpin()
	{
		System.out.println("786");

	}

}
public class finalMethod {

	public static void main(String[] args) {
		test d=new test();
		d.print();
		d.ATMpin();

	}

}
