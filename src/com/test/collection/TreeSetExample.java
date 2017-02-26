package com.test.collection;

import java.util.Iterator;
import java.util.TreeSet;;
public class TreeSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		  TreeSet<String> al=new TreeSet<String>();
		  al.add("ankit");
		  al.add("bablu");
		  al.add("rahul");
		  al.add("bablu");
		  al.add("rahul");
		  
		  Iterator<String> itr = al.iterator();
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
			  
		  }
		  
		 }  
		}  