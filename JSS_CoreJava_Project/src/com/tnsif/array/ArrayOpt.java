package com.tnsif.array;

import java.util.Scanner;

public class ArrayOpt {
	
	Scanner sc;
	
	 void printArray(int[] arr) {
		System.out.println("Array elements are : ");
		for(int i=0; i<arr.length; i++) 
			System.out.print(arr[i] + "\t");
		System.out.println();
	}
	
	void addElements(int[] arr) {
		sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static int getOdd(int b[]) {
		int count = 0;
		for (int i=0; i<b.length; i++) {
			if(b[i]%2!=0) {
				count++;
			}
		}
		return count;
	}
	
	public static int getEven(int b[]) {
		int count = 0;
		for (int i=0; i<b.length; i++) {
			if(b[i]%2==0) {
				count++;
			}
		}
		return count;
	}
	

}
