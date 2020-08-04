package util;

public class Util {
	public static int[] generateRandomSequence(int len, int range) {
		int[] arr = new int[len];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * range);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		return arr;
	}
}
