package indiabix.com;

public class Example3 {
	//Parameterized constructor
	String Book;
	int Code;
	double price;
	
	public Example3(String b,int c,double p) {
		Book=b;
		Code=c;
		price=p;
	
	}
	public void Display() {
		System.out.printf("\nBook name: "+Book);
		System.out.printf("\ncode no: "+Code);
		System.out.printf("\nBook price: "+price);
		System.out.printf("\n----------");

	}
	public static void main(String[] args) {
		Example3 e=new Example3("Java programming ",1456,453);
		Example3 c=new Example3("Python programming ",1356,342);
		Example3 d=new Example3("C programming",1256,235);
		e.Display();
		c.Display();
		d.Display();

		

	}

}
