package com.test.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String...strings)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
						al.add(1);
						al.add(3);
						al.add(2);
						al.add(4);
						al.add(6);
						al.add(4);
						al.add(3);
						al.add(5);
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
