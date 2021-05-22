package com.test;

public class InterviewQuestions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		try {
			
			int[] num= {2,3,4,5};
			System.out.println(num[5]);
			
		} catch (ArrayIndexOutOfBoundsException e2) {
			
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		catch (Exception e) {
			
			System.out.println("Exception");
			}
		
		
		}

}


