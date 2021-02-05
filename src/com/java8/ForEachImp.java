package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class ForEachImp {
	
	
	public static void doubleIT(int i)
	{
		System.out.println(2*i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> values2=Arrays.asList(12,20,45,654,80,40);
		
		//values.forEach(s->System.out.println(s));
		
		values.forEach(System.out::println);
		
		TreeMap<Integer,String> map=new TreeMap<Integer, String>();
		 map.put(1,"John"); map.put(3,"Rio"); map.put(5,"pat"); map.put(2,"JIM");
		 map.put(4,"Daniel");
		 
		 map.forEach((i,j)->System.out.println(i+"="+j));
		 
		 values.forEach(ForEachImp::doubleIT);
		 
		 System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum));
		 
		 System.out.println(values2.stream()
		 .filter(i->i%5==0)//it will filter the values divide by 5
		 .map(i->i*2)//and double the values after filter
		 .findFirst());//get the first vnumber divisible by 5
		 
		 
		 
		

	}

}
