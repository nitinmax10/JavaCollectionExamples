package com.test.exception;

public class MultiCatchDemo {
	public static void main(String... strings )
	{
	try{
		 
	     //int b =39/0; 
	      int a[] = new int[5];  
	     a[5] = 4;  
	}
	catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
//	catch(NullPointerException ne)
//	{
//		System.out.println(ne);
//	}

	}
}
