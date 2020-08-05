package day05.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sum {

	public static int numsToPick;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(
				new FileInputStream("input/input06.txt"));
		
		numsToPick = sc.nextInt();
		
		int caseNum = 0;
		while(sc.hasNextLine()) {
			caseNum++;
			sc.nextLine();
			int len = sc.nextInt();
			int[] arr = new int[len];
			for(int i = 0; i < len; i++) {
				arr[i] = sc.nextInt();
			}
//			System.out.println(Arrays.toString(arr));
			System.out.printf("%d ", caseNum);
			System.out.println(maxOfSum(arr, 0));
		}
	}
	
	public static int bitmask = 0;
	
	public static int maxOfSum(int[] arr, int index) {
		int res = -1;
		int sum1, sum2;
		
		//모든 수를 체크했는가?
		if(index < arr.length) {
			//완전탐색으로 모든 수의 조합을 선택한다.
			bitmask = bitmask | (1 << index);
			sum1 = maxOfSum(arr, index + 1);
			bitmask = bitmask & ~(1 << index);
			sum2 = maxOfSum(arr, index + 1);
		}else {
			//선택된 수의 합계를 구한다.
			int sum = 0;
			int count = 0;
			for(int i = 0; i < arr.length; i++) {
				if(count > numsToPick) {
					break;
				}
				if((bitmask & (1 << i)) != 0) {
					count++;
					sum += arr[i];
				}
			}
			
			//선택된 수가 선택해야 할 개수(2개)와 같을 경우, 합계를 반환한다.
			if(count == numsToPick) {return sum;}
			else {return -1;}
		}
		
		//두 가지 값 중 최대값을 구한다.
		if (sum1 != -1 && sum2 == -1) {
			return sum1;
		}else if (sum1 == -1 && sum2 != -1) {
			return sum2;
		}else if (sum1 == -1 && sum2 == -1) {
			return -1;
		}else {
			return sum1 > sum2 ? sum1 : sum2;
		}
	}
}
