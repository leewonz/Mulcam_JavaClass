package test;

public class Solution_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = {'A', 'B', 'C', 'D'};
		
		print(c);//c의 부분집합 목록 출력
	}
	private static void print(char[] c) {
		int cLen = c.length;
		for(int i = 0; i < (1 << cLen); i++) {
			System.out.printf("count: %d ", count(i));
			System.out.print("{");
			boolean isFirst = true;
			for(int j = 0; j < cLen; j++) {
				if((i & (1<<j)) != 0){
					if(!isFirst) {System.out.print(", ");}
					System.out.printf("%s",c[j]);
					isFirst = false;
				}
			}
			System.out.println("}");
		}
	}
	
	private static int count(int i) {
		int res = 0;
		while(i != 0) {
			if((i & 1) == 1) {res++;}
			i = i >> 1;
		}
		return res;
	}
}
