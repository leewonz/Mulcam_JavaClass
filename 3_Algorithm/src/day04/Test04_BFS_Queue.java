package day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test04_BFS_Queue {

	static int[][] G;
	static boolean[] V;
	static int N;
	static int count;
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new FileInputStream("input/p71.txt"));
		
		N = in.nextInt();
		G = new int[N][N];
		V = new boolean[N];
		
		count = in.nextInt();
		
		for(int i = 0; i < count; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			G[x][y] = G[y][x] = 1;
		}
		
		print(G);
		bfs(0);
	}
	static void print(int[][] G) {
		for(int i = 0; i < G.length; i++) {
			System.out.println(Arrays.toString(G[i]));
		}
	}
	
	
	static Queue<Integer> queue = new LinkedList<Integer>();
	private static void bfs(int node) {
		queue.offer(node);
		while(!queue.isEmpty()) {
			int num = queue.poll();
			System.out.printf("%d, ", num);
			for(int i = 0; i < N; i++) {
				if ((G[num][i] == 1) && (!V[i])) {
					queue.offer(i);
					V[i] = true;
				}
			}
		}
	}
	
}
