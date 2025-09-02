package com.tnsif.generics;
import com.tnsif.hierarchialinheritance.Citizen;

public class GenericMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod obj = new GenericMethod();
		
		Integer[] intarray = { 10, 20, 30 };
		
		String[] str = { "java", "programming", "language" };
		
		Citizen[] c= {new Citizen("Manjula","Bangalore",1462269847,364861386),new Citizen("Vani","Bangalore",1462269847,364861386)};

		//Display Integer Array 
				obj.displayArrayElements(intarray);
				
				//Display String Array 
				obj.displayArrayElements(str);
				
				//Display Citizen Array 
				obj.displayArrayElements(c);

	}

}
