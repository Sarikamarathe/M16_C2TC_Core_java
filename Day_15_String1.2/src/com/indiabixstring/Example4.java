package com.indiabixstring;

import java.util.StringTokenizer;

public class Example4 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Merry Go.Ground");//space to marry and go o/p is only marrywhy bcoz afer marry a space
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());//print go.Ground

	}

}
