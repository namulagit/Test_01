package com.test;

import java.util.*;

public class CollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();

		names.add("Ram");
		names.add("pvan");
		names.add("Rahim");
		names.add("Hin");
		names.add("Abdul");
		names.add(null);
		// Collections.addAll(names, names)

		Set<String> hashset = new HashSet<String>();

		hashset.add("John");
		hashset.add("Obama");
		hashset.add("clinten");
		hashset.add("Obama");
		hashset.add("Test");
		hashset.add(null);
		
		System.out.println(hashset.equals(hashset));
		boolean ss = hashset.addAll(names);
		
		System.out.println(hashset);
		System.out.println(hashset.containsAll(names));
		
		System.out.println(hashset.retainAll(names));

		System.out.println(hashset);
		
		Iterator it=hashset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
	}

}
