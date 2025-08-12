package com.tnsif.hierarchialinheritance;
import java.util.Scanner;

public class Hierarchial {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//employee details
		System.out.println("enter the name of employee");
		String name=sc.next();
		System.out.println("enter the id of employee");
		int id =sc.nextInt();
		System.out.println("enter the adhaar of employee");
		long adharNumber=sc.nextLong();
		System.out.println("enter the salary of employee");
		float salary=sc.nextFloat();
		System.out.println("enter the address of employee");
		String address=sc.next();
		System.out.println("enter the phone no of employee");
		long phone=sc.nextLong();
		//System.out.println(a);
		
//		Employee el = new Employee(name,address,adharNumber);
//		Student sc = new Student();

}
}
