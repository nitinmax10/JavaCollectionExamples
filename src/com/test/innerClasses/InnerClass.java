package com.test.innerClasses;

class Outer_Demo
{
  private int num = 122;
  private class Inner_Demo
  {
	  public void getValue()
	  {
		  System.out.println("in inner class"); 
	  }
  }
  public class Inner
  {
	  public int getNum()
	  {
		  System.out.println("in Inner Class");
		  return num;
	  }
  }
  
  void display()
  {
	Inner_Demo in = new Inner_Demo();
	in.getValue();
  }
}

 public class InnerClass {
	 
		public static void main(String... str)
		{
			Outer_Demo or = new Outer_Demo();
			or.display();
			Outer_Demo.Inner inn = or.new Inner();
			System.out.println(inn.getNum());
			
		}
	 

}
