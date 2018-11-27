package br.com.sysmi.desafio02.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ListNumberTest {

	private ListNumber listNumber = new ListNumber();	
	
	@Test(expected = IllegalArgumentException.class)
	public void dontReceive_Empty_Array() {
		listNumber.countNumber(new int[0], 4);
	}
	
	@Test
	public void check_Return_Array_Size() {
		int size = listNumber.countNumber(new int[] { 3,4,5,1,2,9 }, 5);
		assertEquals(4, size);
	}
	
	@Test
	public void check_Array_Sort_FirstItem() {
		int[] arr = new int[] { 13,14,10,6,97,136 };
		listNumber.countNumber(arr, 100);		
		assertEquals(arr[0], 6);		
	}
	
	@Test
	public void check_Array_Sort_LastItem() {
		int[] arr = new int[] { 13,14,10,6,97,136 };
		listNumber.countNumber(arr, 100);		
		assertEquals(arr[(arr.length-1)], 136);		
	}
}
