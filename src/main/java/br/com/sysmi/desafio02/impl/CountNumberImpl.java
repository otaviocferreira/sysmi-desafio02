package br.com.sysmi.desafio02.impl;

import br.com.sysmi.desafio02.helper.ListNumber;

public class CountNumberImpl {

	public static void main(String[] args) {
		ListNumber listNumber = new ListNumber();
		int[] arr = new int[] { 3,4,5,1,2,9 };
		
		printArrayItens(arr);
		
		int qty = listNumber.countNumber(arr, 4);
		
		System.out.println("Quantidade de itens menores que 4: " + qty);
		printArrayItens(arr);
	}

	private static void printArrayItens(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
