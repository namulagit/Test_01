package com.comparatorI;

import java.util.*;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Student> s=new ArrayList<Student>();
		s.add(new Student(101,"JOHN",21));
		s.add(new Student(106,"Kenndedy",23));
		s.add(new Student(105,"Acmchy",26));
		s.add(new Student(104,"Trcia",22));
		
		//Collections.sort(s,new NameComparator());
		
		Collections.sort(s,new AgeComparator());

			for(Student s1:s)
			{
				
				System.out.println(s1.age+"-"+s1.name+"-"+s1.rollno);
			}
		
	}

}
