package com.tnsif.wrapperclass;

public class WrapperClassDemo {
	public static void main(String args[]) {
		
		Integer i1 = Integer.valueOf(5);  // Recommended

		System.out.println(i1);
		
		int b=i1.intValue();
		System.out.println(b);
		
		
        int c=i1;
        System.out.println(c);
        
        
         float f=67.87f;
        
         Float r=Float.valueOf(f);
         System.out.println(r);
	}

}
