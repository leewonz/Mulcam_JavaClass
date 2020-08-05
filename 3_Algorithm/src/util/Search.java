package util;

public class Search {
	public static int binSearch(int[] arr, int left, int right, int key) {
		if (left > right) {return -1;}
		int idx = (left + right) / 2;
		if(arr[idx] == key) {return idx;}
		else if (arr[idx] < key) {return binSearch(arr, idx + 1, right, key);}
		else {return binSearch(arr, left, idx - 1, key);}
	}
}
