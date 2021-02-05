package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscendingWordsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] countries = {"India","China","Pakistan","South-africa","zimbambe","Uganda"};
		List<String> l=Arrays.asList(countries);
		
		
		Collections.sort(l);
		
		System.out.println(l);
		
		
	}

}
