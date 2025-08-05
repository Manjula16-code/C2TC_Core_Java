package com.tnsif.usingfinal;

public class Finalvariable {
	//The final instance variable should be initialized compulsorily
		//private final int x;
		
		 final int x=100;
		 
		// Declaring a static blank final variable.
		final static int Y;
		
		// Declare & intializing static final variable.
			final static int Z = 10;
			
	//instance method
		void change(){
			//this.x=200;//final variables can't be re-assigned
			//this.Y=100; //final variables can't be re-assigned
		}
		
		// Declare a static block to initialize the final static variable.
			static {
				Y = 20;
				//Z = 100; // Once intialized can't be re-assigned
				System.out.println("Value of Y: " + Y);
			}


}
