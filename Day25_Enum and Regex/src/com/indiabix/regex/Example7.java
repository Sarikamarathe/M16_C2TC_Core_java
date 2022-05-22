package com.indiabix.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("job");
		Matcher m=p.matcher("Java programming is enough to get ajob in IT industry");
		while(m.find())
		{
			System.out.printf("Pattern found from :"+m.start() + " to "+(m.end()-1));
		}
		System.out.println("Nothing");
	}

}
