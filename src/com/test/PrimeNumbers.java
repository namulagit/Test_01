package com.test;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++)
		{
			boolean flag=true;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					
					flag=false;
				}
				
				
			}
			if(flag)
			{
			System.out.print(i+",");
			}
			
		}

	}

}
