package com.test.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String... arg ) {
		
	
	HashSet<String> hset = new HashSet<String>();
					hset.add("ankit");
					hset.add("rohit");
					hset.add("bablu");
					hset.add("rahul");
					
	Iterator<String> itr = hset.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}		
}
