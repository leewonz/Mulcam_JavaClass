package day03;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] t1 = new int[4][3];
		t1[0][2] = 1;
		t1[1][2] = 1;
		t1[2][2] = 1;
		t1[3][2] = 1;
		for(int i = 0; i < t1.length; i++) {
			for(int j = 0; j <t1[i].length; j++) {
				System.out.printf("%2d ", t1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		int[][] t1_2 = new int[4][];
		t1_2[0] = new int[4];
		t1_2[1] = new int[1];
		t1_2[2] = new int[3];
		t1_2[3] = new int[7];
		for(int i = 0; i < t1_2.length; i++) {
			for(int j = 0; j < t1_2[i].length; j++) {
				System.out.printf("%2d ", t1_2[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}
}
