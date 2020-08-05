package day05.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class PaperDiv {

	static int[][] board;
	
	public static void main(String[] args) throws FileNotFoundException {
		int size;
		
		Scanner sc = new Scanner(
				new FileInputStream("input/PaperDiv.txt"));
		
		size = sc.nextInt();
		
		board = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
//		for(int i = 0; i < size; i++) {
//			for(int j = 0; j < size; j++) {
//				System.out.print(board[i][j]);
//			}
//			System.out.println();
//		}
		
		int[] res = div(0, 0, size, size);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
	
	public static int[] div(int sX, int sY, int eX, int eY) {
		
		//res[0]은 흰색 사각형의 수, res[1]은 파란 사각형의 수
		//마지막에 res는 return값으로 사용된다.
		int[] res = new int[2];
		
		//현재 사각형이 나뉘어지는지를 나타내는 flag변수
		boolean canDivide = false;
		
		//정사각형 영역이 한 가지 색으로 이루어져 있으면 canDivide = false
		//그렇지 않으면 canDivide = false이다. 
		int firstCol = -1;
		CHECK: for(int i = sY; i < eY; i++) {
			for(int j = sX; j < eX; j++) {
				int currentCol = board[i][j];
				
				if (firstCol == -1) {
					firstCol = board[i][j];
				}
				
				if (firstCol != -1 && firstCol != currentCol) {
					canDivide = true;
					break CHECK;
				}
			}
		}
		
		if (canDivide) {
			//네 영역으로 나누어 다시 검사한다.
			int mX = (eX + sX) / 2; 
			int mY = (eY + sY) / 2; 
			int[][] nextRes = new int[4][2];
			nextRes[0] = div(sX, sY, mX, mY);
			nextRes[1] = div(mX, sY, eX, mY);
			nextRes[2] = div(sX, mY, mX, eY);
			nextRes[3] = div(mX, mY, eX, eY);
			
			//return값 res에 재귀 실행 결과를 합산한다. 
			for(int[] i : nextRes) {
				res[0] += i[0];
				res[1] += i[1];
			}
		} else {
			//현재 사각형의 종류에 1을 대입한다.
			res[board[sY][sX]] = 1;
		}
		
		return res;
	}
}
