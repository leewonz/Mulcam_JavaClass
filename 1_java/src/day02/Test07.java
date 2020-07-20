package day02;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍갈동";
		int avg = 79;
		char grade = 'A';
		
		if(avg >= 90 && avg <= 100) {
			grade = 'A';
		}else if (avg >= 80 && avg < 90) {
			grade = 'B';
		}else if (avg >= 70 && avg < 80) {
			grade = 'C';
		}else if (avg >= 60 && avg < 70) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("이름:%s, 점수:%d, 학점:%c %n", name, avg, grade);
		
		switch(avg / 10) {
		case 10: 
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
	}
}
