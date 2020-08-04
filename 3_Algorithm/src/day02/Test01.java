package day02;

import java.util.Arrays;
import util.Util;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = Util.generateRandomSequence(10, 10);
		
		int key = 9;
		int index = seqSearch(arr, key);
		if(index == -1) {System.out.println("검색 결과 없음...");}
		else {System.out.printf("%d번째 위치에 %d이(가) 있다...!", index, key);}
		
	}
	
	public static int seqSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
			
		}
		return -1;
	}

}
