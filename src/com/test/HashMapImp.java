package com.test;

import java.util.*;

public class HashMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"John");
		map.put(2,"Rio");
		map.put(3,"pat");
		map.put(4,"JIM");
		map.put(5,"Daniel");
		
		//System.out.println(map);
		
		
		for(Map.Entry<Integer,String> s:map.entrySet())
		{
			
			
			System.out.println(s.getKey()+"-"+s.getValue());
		}
		
		Set<Map.Entry<Integer, String>> entry=map.entrySet();
		
		Iterator<?> iter=entry.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
			
		}
		
		

	}

}
