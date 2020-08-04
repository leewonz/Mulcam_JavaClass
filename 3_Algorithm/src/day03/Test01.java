package day03;

import java.util.Arrays;

import util.Sort;
import util.Util;

public class Test01 {
	public static void main(String[] args) {
		int[] arr = Util.generateRandomSequence(10, 10);
		System.out.println(Arrays.toString(arr));
		Sort.mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		/*
		arr = Util.generateRandomSequence(10, 10);
		System.out.println(Arrays.toString(arr));
		Sort.quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));*/
	}
}
