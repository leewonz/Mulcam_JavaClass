package util;

import java.util.Arrays;

public class Sort {
	public static void selectionSort(int[] arr) {
		int len = arr.length;
		
		for(int i = 0; i < len; i++) {
			int min = Integer.MAX_VALUE;
			int min_index = -1;
			for(int j = i; j < len; j++) {
				if(arr[j] < min ) {
					min = arr[j];
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = min;
			arr[min_index] = temp;
		}
	}
	
	
	static int[] temp;
	public static void mergeSort(int[] arr) {
		temp = new int[arr.length];
		merge(arr, 0, arr.length - 1);
	}
	private static void merge(int[] arr, int begin, int end) {
		//System.out.println(begin + " / " + end);
		
		if(begin >= end) {return;}
		
		int mid = (begin + end)/2;
		merge(arr, begin, mid);
		merge(arr, mid + 1, end);
		
		for(int i = begin; i <=end; i++) {
			temp[i] = arr[i];
		}
		
		int i = begin;
		int j = mid + 1;
		int k = begin;
		
		while(i <= mid && j <= end) {
			arr[k++] = temp[i] < temp[j] ? temp[i++] : temp[j++];
		}
		
		while(i <= mid) {arr[k++] = temp[i++];}
		while(j <= end) {arr[k++] = temp[j++];}
		
		//System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			int pivot = left;
			int i = left + 1;
			int j = right;
			while(i <= j) {
				while(i < arr.length && arr[i] <= arr[pivot]) {i++;}
				while(j >= 0 && arr[j] > arr[pivot]) {j--;}
				if (i < j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			int temp = arr[pivot];
			arr[pivot] = arr[i-1];
			arr[i-1] = temp;
			quickSort(arr, left, j - 1);
			quickSort(arr, j + 1, right);
		}
	}
	
	public static void quickSort2(int[] arr, int left, int right) {
		if (left < right) {
			int pivot = left;
			int i = left + 1;
			int j = right;
			System.out.println("before: " + Arrays.toString(arr));
			System.out.println("range: " + i + " ~ " + j + " / pivot: " + arr[pivot]);
			while(i <= j) {
				while(i < arr.length && arr[i] <= arr[pivot]) {i++;}
				while(j >= 0 && arr[j] > arr[pivot]) {j--;}
				if (i < j) {
					System.out.println("swap " + arr[i] + " and " + arr[j]);
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(" i = " + i + " ");
			System.out.println("swap " + arr[pivot] + " and " + arr[j]);
			int temp = arr[pivot];
			arr[pivot] = arr[i-1];
			arr[i-1] = temp;
			System.out.println("after: " + Arrays.toString(arr));
			System.out.println();
			quickSort(arr, left, j - 1);
			quickSort(arr, j + 1, right);
		}
	}
}
