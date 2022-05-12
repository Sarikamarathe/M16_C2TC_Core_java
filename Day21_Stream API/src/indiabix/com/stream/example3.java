package indiabix.com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class example3 {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,30,12,17,16); 
		Optional<Integer>o=obj.stream().reduce((a,b)->(a*b));
		if(o.isPresent())
		{
			System.out.println("Result: "+o.get());
		}
	}

}
