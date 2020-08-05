package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test02_회의실배정 {
	
	static M[] m;
	static int N;
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input/p10/txt"));
	
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		//m = new M[n];
		
		for(int i = 0; i < N; i++) {
		//	M a = new m
		}
	}
}

class M implements Comparable<M>{
	int start;
	int end;
	@Override
	public String toString() {
		return "M [start=" + start + ", end=" + end + "]";
	}
	@Override
	public int compareTo(M o) {
		// TODO Auto-generated method stub
		
		return this.end - o.end;
	}

}
/*
10
1 4 1 6 6 10 5 7 3 8 5 9 3 5
*/