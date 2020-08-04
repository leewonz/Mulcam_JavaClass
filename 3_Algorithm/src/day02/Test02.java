package day02;

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
		
		System.out.printf("%d가 %d에 있다", target, binSearch(arr, 10));
		System.out.println();

	}

	private static int binSearch(int[] arr, int key) {
		util.Sort.selectionSort(arr);

		int high, low, mid;
		low = 0;
		high = arr.length - 1;

		while (low < high) {
			mid = (low + high) / 2;
			System.out.printf("%d, %d, %d%n", low, mid, high);
			if (arr[mid] == key) {
				return mid;
			} else if (key > arr[mid]) {
				//if(low == mid) { break;}
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}
}
