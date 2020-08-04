package day03.ex;

import java.util.Arrays;

class QuickSort {
	// 퀵 정렬
	static void quickSort(int[] a, int left, int right) {
		int pl = left;					// 왼쪽 커서
		int pr = right;					// 오른쪽 커서
		int x = a[(pl + pr) / 2];		// 피벗

		
		while (pl <= pr) {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} 

		if (left < pr)  quickSort(a, left, pr);
		if (pl < right) quickSort(a, pl, right);
	}
	
    // 배열 요소 a[x]과 a[y]의 값을 바꿉니다.
	static void swap(int[] a, int x, int y) {
		int temp = a[x];  
		a[x] = a[y];  
		a[y] = temp;
	}
	public static void main(String[] args) {
		
		int [] x = {1,3,3,3,5,1,3,5};
		quickSort(x, 0, x.length-1);			// 배열 x를 퀵 정렬

		System.out.println("오름차순으로 정렬했습니다.");
        System.out.println(Arrays.toString(x));

	}
}