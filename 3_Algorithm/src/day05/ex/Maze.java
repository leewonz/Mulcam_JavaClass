package day05.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze {

	public static char[][] board;
	public static int h, w;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner sc = new Scanner(new FileInputStream("input/p100.txt"));
		
		h = sc.nextInt();
		w = sc.nextInt();
		
		board = new char[h][w];
		
		sc.nextLine();
		for(int i = 0; i < h; i++) {
			String line = sc.nextLine();
			for(int j = 0; j < line.length(); j++) {
				board[i][j] = line.charAt(j);
			}
		}
		
		//미로 출력
//		for(int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				System.out.print(board[i][j]);
//			}
//			System.out.println();
//		}
		
		System.out.println(findPath(new Point(1,0,0)));
	}
	
	public static int findPath(Point point) {
		Queue<Point> que = new LinkedList<Point>();
		
		final int[] dX = {-1, 1, 0, 0};
		final int[] dY = {0, 0, -1, 1};
		
		que.offer(point);
		
		while(!que.isEmpty()) {
			//큐에서 꺼냄
			Point p = que.poll();
			int x = p.getX();
			int y = p.getY();
//			System.out.println(p.toString() + "current position");
			
			//종료 조건 체크
			if (board[y][x] == 'G') {
				return p.getLen();
			}
			
			//꺼낸 위치를 불가능으로 만듬
			String lenStr = Integer.toString(p.getLen());
			board[y][x] = lenStr.charAt(lenStr.length() - 1);
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			//가능한곳을 확인함
			for(int d = 0; d < dX.length; d++) {
				Point newP = 
						new Point(
						p.getX() + dX[d],
						p.getY() + dY[d],
						p.getLen() + 1);
//				System.out.printf(newP.toString());
				//큐에 가능한곳을 넣음
				if (check(newP)) {
					que.offer(newP);
				}
			}
		}
		return -1;
	}
	
	public static boolean check(Point point) {
		int x = point.getX();
		int y = point.getY();
		
		if(x < 0 || x >= w || y < 0 || y >= h) {
//			System.out.println("Out of bound");
			return false;
		}
		
		char tile = board[y][x];
//		System.out.println("tile: " + tile);
		if(tile == 'S' || tile == '#' || (tile >= '0' && tile <= '9')) {
			return false;
		}
		
		return true;
	}
}

class Point{
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", len=" + len + "]";
	}

	private int x, y, len;

	public Point(int x, int y, int len) {
		this.x = x;
		this.y = y;
		this.len = len;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}
	
	//public static boolean check(int x, int)
	
}
