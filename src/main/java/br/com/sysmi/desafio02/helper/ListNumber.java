package br.com.sysmi.desafio02.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNumber {

	private List<Integer> arrLessThan;

	public int countNumber(int[] arr, int lessThan) {
		if (arr.length == 0) throw new IllegalArgumentException("Empty arrays are not permitted.");
		
		arrLessThan = new ArrayList<>();
		
		Arrays.sort(arr);
		
		for (int i : arr) {			
			if (i < lessThan) arrLessThan.add(i);
		}

		return arrLessThan.size();
	}
}
