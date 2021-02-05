package com.test;

import java.util.HashMap;
import java.util.Map;

public class DiplicateArrayNumbersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar_1 = { 2, 2, 3, 4, 5, 6, 7, 8, 3 };

		Map<Integer, Integer> counterMap = new HashMap<>();

		for (int i = 0; i < ar_1.length - 1; i++) {

			if (counterMap.containsKey(ar_1[i])) {
				counterMap.put(ar_1[i], counterMap.get(ar_1[i]) + 1);

			} else {
				counterMap.put(ar_1[i], 1);
			}

		}
		System.out.println(counterMap);

	}

}
