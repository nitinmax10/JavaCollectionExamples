package com.test.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(5);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
