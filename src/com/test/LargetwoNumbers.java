package com.test;

public class LargetwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numbers= {3,6,4,2,9,22,55,23,567,987};
		int large1 = 0,large2=0;
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>large1)
			{
				large2=large1;
				large1=numbers[i];
				
			}
			else
			{
				large2=numbers[i];
			}
			
			
		}
		System.out.println(large1+"-"+large2);
	}

}
