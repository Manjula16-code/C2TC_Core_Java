package com.tnsif.exception;

public class ExceptionDemo {
	public static void main (String[] args) {
		int d = 0;
		//System.out.println("value "+d);
		try {
			int x = 50/2;
		}
		catch(ArithmeticException e) {
		System.out.println(e);	
		}
		finally {
			System.out.println("Finally block");
		}
	}

}
