package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListImpl {
	
	public static void douleIt(int num)
	{
		
		System.out.println(num*2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> ardr= List.of(5,3,6,8,99,33);
		
		List<Integer> li= Arrays.asList(55,65,33,78,67);
		
		
		List<Integer> li2= Arrays.asList(5,3,6,8,99,33);
		
		List<Integer> li3= List.of(5,3,34,45,455,33);
		
		System.out.println(li2);
		Object[] numbers =li2.toArray();
		
		//li3.addAll(li2);
		//System.out.println("Before"+li2);
		
		
		System.out.println(li2);
		System.out.println(Arrays.toString(numbers));
		
		ArrayList<Integer> l = new ArrayList<>(); 
        l.add(10); 
        l.add(15); 
        l.add(20); 
       
        System.out.println(l); 
        // Initializing a collection to be appended to list 
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        arr.add(100); 
        arr.add(200); 
        arr.add(300); 
        System.out.println(arr); 
  
        l.addAll(li3); 
  
        System.out.println(l+"after"); 
        l.forEach(System.out::println);
        
        arr.forEach(ListImpl::douleIt);
        
        System.out.println("Stream"+Arrays.toString(l.stream().filter(i->i%15==0).map(i->i*2).toArray()));
        
        
        ListIterator<?> s= l.listIterator();
        while(s.hasNext())
        {	
     	  s.forEachRemaining(System.out::println);
        }
        
       Iterator<?> c=l.iterator();
       while(c.hasNext())
       {
    	   //System.out.println(c.next());
       }
	}

}
