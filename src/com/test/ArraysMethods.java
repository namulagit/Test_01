package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;





public class ArraysMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {24,1,3,44,57};
		
		int[] num1= {1,24,3,4,5};
		int doublenum=0;
		for(int i = 0; i<4; i++)
		{
			doublenum+=i*2;
			//System.out.println(doublenum);
			
		}
		
		System.out.println(Arrays.binarySearch(num, 45));
		
		System.out.println(Arrays.compare(num, num1));
		
		int[] cp=Arrays.copyOf(num, 7);
		System.out.println(Arrays.toString(cp));
		System.out.println(Arrays.mismatch(num, num1));
		
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		
		/*
		 * Arrays.binarySearch(null);
		 * 
		 * String ss="Test"; ss.equals(ss)
		 */
		
	Spliterator<?>	spl=Arrays.spliterator(num1);
	spl.forEachRemaining(System.out::print);
		
	
	 List<Integer> arr = new ArrayList<Integer>(); 
     arr.add(null); 
     arr.add(200); 
     arr.add(null); 
     System.out.println(arr); 
     
   //  arr.remove(1);
    
//     /System.out.println(arr.indexOf(300));
     
     Set<Integer> hashSet = new HashSet<Integer>(); 
     hashSet.add(100); 
     hashSet.add(null); 
     hashSet.add(null); 
     System.out.println(hashSet); 
	
		System.out.println(Arrays.toString(arr.toArray()));
		
		
		

	
	}

}
