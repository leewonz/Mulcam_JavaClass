package day03;

public class Test01 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%sHello Java.%d%n", i % 2 == 0 ? "" : " ", i);
		}
		
		System.out.println("---------------");
		
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
			System.out.printf("%d + %n",i);
		}
		System.out.println(sum);
		
		System.out.println("---------------");
		
		String name = "홍길동";
		System.out.print(name.charAt(0) + "**");
		
		System.out.println("---------------");
		
		String msg = "Hello Java";
		for(int i = 0; i < msg.length(); i++) {
			System.out.printf("%c ", msg.charAt(i));
		}
		System.out.println();
		for(int i = msg.length() - 1; i >= 0; i--) {
			System.out.printf("%c ", msg.charAt(i));
		}
		System.out.println();
		
		System.out.println("---------------");
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("i=%d, j=%d %n", i, j);
			}
		}
		int i = 3;
		while(i < 3) {
			System.out.printf("~~%d~~%n", i);
			i++;
		}
		
		i = 3;
		do {
			System.out.printf("~~%d~~%n", i);
			i++;
		}
		while(i < 3);
		
		boolean flag = false;
		while(!flag ) {
//			System.out.println("while 구문");
			int num = (int)(Math.random()*10);
			System.out.println(num);
			if(num == 0) {
				flag = !flag;
			}
		}
	}
}
