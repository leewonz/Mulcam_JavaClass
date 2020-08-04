package day03;

import java.util.Arrays;

public class Test01_subset {
	static int[] data = {1, 2, 3};
	static boolean[] V = new boolean[data.length];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(0);
	}
	public static void solve(int idx) {
		//System.out.println(idx);
		if(idx >= V.length) {
			System.out.println(Arrays.toString(V));
			return;
		}
		V[idx] = true;
		solve(idx + 1);
		V[idx] = false;
		solve(idx + 1);
	}

}
