package indiabix.com.stream;

import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,30,12,17,16); 
		obj.stream().distinct().forEach(System.out::println);
		System.out.println("distinct output:");
		obj.stream().limit(5).forEach(System.out::println);
		System.out.println("skip output:");
		obj.stream().skip(5).forEach(System.out::println);

	}

}
