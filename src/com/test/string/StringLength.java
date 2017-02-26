package com.test.string;

public class StringLength {
	
	static int i,c,res;
	static int length(String s)
	{
		try{
			for(i=0, c=0; 0<=i; i++, c++)
			{
				s.charAt(i);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return c;
	}

	public static void main(String...str)
	{
		System.out.println("Orignal String is ");
		System.out.println("My Name is Nitin Sherawat");
		res = StringLength.length("My Name is Nitin Sherawat");
		System.out.println(res);
		
	}
}
