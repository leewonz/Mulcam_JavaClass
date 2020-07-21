package day03;

public class GuguClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A:*/for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				//if (j == 5) {break A;}
				System.out.printf("%d * %d = %2d|", j, i, j*i);
			}
			System.out.println();
		}
	}

}
