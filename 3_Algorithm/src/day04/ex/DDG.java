package day04.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class DDG {
	static int[][] board;
	static boolean[][] checked;
	static int N;
	
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner in = new Scanner(new FileInputStream("input/DDG.txt"));
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		board = new int[N][N];
		checked = new boolean[N][N];
		
		List<Integer> dens = new ArrayList<Integer>();
		
		in.nextLine();
		for (int i = 0; i < N; i++) {
			String line = in.nextLine();
			for (int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(line.charAt(j) + "");
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int num = check(i,j);
				if(num != 0) {dens.add(num);}
			}
		}
		
		Collections.sort(dens);
		System.out.println(dens.size());
		for(int den : dens) {
			System.out.println(den);
		}
	}
	
	public static int check(int x, int y){
		if(x < 0 || x >= N || y < 0 || y >= N) {
			return 0;
		}
		if (checked[x][y] == true) {
			return 0;
		}
		
		checked[x][y] = true;
		
		int res = 0;
		
		if (board[x][y] == 1) {res++;} 
		else {return 0;}
		
		res += check(x - 1, y);
		res += check(x + 1, y);
		res += check(x, y + 1);
		res += check(x, y - 1);
		
		return res;
	}
}
