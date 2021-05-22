package com.searchAlgorithms;

import java.util.Arrays;

public class BinarySearch_Test {

	public static int binary_Search(int[] ar) {

		int startIndex = 0;
		int endIndex = ar.length - 1;
		int key = 22;

		while (startIndex <= endIndex) {
			int mid = (startIndex + endIndex) / 2;
			int midValue = ar[mid];

			if (midValue < key) {

				startIndex = mid + 1;

			} else if (midValue > key) {
				
				endIndex=mid-1;

			}
			else
			{
				return mid;
			}

		}
return -(startIndex+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1= {1,3,4,5,6};
		System.out.println(binary_Search(num1));
		
		
		

	}

}
