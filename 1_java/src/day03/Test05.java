package day03;

public abstract class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2, 4, 6, 8};
		int[] num2 = num;
		int[] num3 = num = num.clone();
		num[2] = 100;
		
	}

}
