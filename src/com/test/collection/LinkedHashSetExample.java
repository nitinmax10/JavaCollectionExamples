package com.test.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> lset = new LinkedHashSet<String>();
							lset.add("ankit");
							lset.add("rahul");
							lset.add("bablu");
							lset.add("rohit");
						
			Iterator<String> itr = lset.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}

	}

}
