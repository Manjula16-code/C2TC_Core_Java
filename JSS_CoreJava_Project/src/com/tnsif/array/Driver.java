package com.tnsif.array;

public class Driver {
	
	public static void main(String[] args) {
		ArrayOpt obj = new ArrayOpt();
		int arr[] = new int[5];
		obj.addElements(arr);
		obj.printArray(arr);
		System.out.println("The odd count is " + obj.getOdd(arr));
		System.out.println("The odd count is " + obj.getEven(arr));
	}
}	
