package ex.algorithm;

import java.util.ArrayList;

import java.util.Arrays;

import util.Util;
import util.Sort;
import util.Search;

public class Test_BinSearch {
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
		
		int res = Search.binSearch(arr, 0, arr.length - 1, 10);
		if (res == -1) {
			System.out.printf("%d은(는) 없다!", target);
		} else {
			System.out.printf("%d이(가) %d에 있다.", target, res);
		}

		System.out.println();

	}
}
