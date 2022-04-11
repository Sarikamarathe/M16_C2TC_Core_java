package indiabix.com;

public class Example2 {

	//parameterized constructor
		String name;
		
		public Example2(String n) {
			name=n;
		}
		public void show_details() {
		
		System.out.printf("\nthis is"+name);
		}
		
		public static void main(String[] args) {
			
			
			Example2 c=new Example2(" audi");
			Example2 e=new Example2(" indigo");
			Example2 d=new Example2(" maruti");
			c.show_details();
			e.show_details();
			d.show_details();




	}

}
