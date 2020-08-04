package day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test01 {

	static int [][] G;
	static int N;
	static int count;
	static boolean [][] V;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/input/p70.txt"));
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		G = new int[N+1][N+1];
		V = new boolean[N+1][N+1];
				
		count = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < count; i++) {
			st = new StringTokenizer(in.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			G[x][y] = G[y][x] = w;
		}
		
		print(G);
		dfs(1);
	}
	private static void dfs(int k) {
		if(k == 8) {return;}
		for(int i = 1; i < N; i++) {
			if (G[k][i] != 0 && !V[k][1]){
				
			}
		}
		
	}
	public static void print(int[][] G) {
		for(int i = 0; i < G.length; i++) {
			System.out.println(Arrays.toString(G[i]));
		}
	}
}
/*
 * 정점과 간선의 ㄱ정보를 입력받아 인접 행렬로 표시
 * 7 11
 * 1 2 47
 * 1 3 69
 * 2 4 57
 * 2 5 124
 * 3 4 37
 * 3 5 59
 * 3 6 86
 * 4 6 27
 */
 