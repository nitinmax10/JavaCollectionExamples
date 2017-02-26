package com.test.collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

class Dog
{
   String color;
   public Dog(String c)
   {
	   color = c;
   }
   public boolean equals(Object o)
   {
	 return ((Dog)o).color.equals(this.color);
   }
   public int hashCode()
   {
	   return color.length();
   }
   public String toString()
   {
	   return color + "Dog";
   }
}


public class HashMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Dog, Integer> map = new HashMap<Dog, Integer>();
		Dog di = new Dog("black");
		Dog d2 = new Dog("white");
		Dog d3 = new Dog("blue");
		Dog d4 = new Dog("white");
		
		map.put(d4, 19);
		map.put(di, 12);
		map.put(d2, 15);
		map.put(d3, 11);
		
		System.out.println(map.size());
		
		for(Map.Entry<Dog, Integer> entry : map.entrySet())
		{
			System.out.println("key: "+ entry.getKey().toString() + " value: " + entry.getValue());
		}

	}

}
