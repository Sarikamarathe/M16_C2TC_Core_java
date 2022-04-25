package com.indiaboxarray;
class student
{
	public String s_name;
	public int marks;
	student(String S_name,int marks)
	{
		this.s_name=s_name;
		this.marks=marks;
	}
}
public class Example3 {

	public static void main(String[] args) {
		student arr[];
		arr=new student[3];
		arr[0]=new student("sarika",67);
		arr[1]=new student("komal",69);
		arr[2]=new student("jayu",64);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("element is"+i+":"+arr[i].marks+" "+arr[i].s_name);
		}

	}

}
