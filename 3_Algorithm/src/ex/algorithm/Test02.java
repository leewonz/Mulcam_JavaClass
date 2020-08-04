package ex.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

import util.Util;
import util.Sort;

public class Test02 {
	public static void main(String[] args) {

		final int len = 10;
		final int range = 20;
		final int target = 10;

		int[] arr = Util.generateRandomSequence(len, range);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();

		Sort.selectionSort(arr);
		

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		System.out.printf("%d가 %d에 있다", target, binSearch(arr, 0, arr.length - 1, 10));
		System.out.println();

	}

	private static int binSearch(int[] arr, int left, int right, int key) {
		if (left > right) {return -1;}
		int idx = (left + right) / 2;
		if(arr[idx] == key) {return idx;}
		else if (arr[idx] < key) {return binSearch(arr, idx + 1, right, key);}
		else {return binSearch(arr, left, idx - 1, key);}
	}
}
