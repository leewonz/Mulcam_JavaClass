package day05;

public class Test01 {

	public static void main(String[] args) {
		Account[] acc = {
			new Account("2020-10","홈길등", 900),
			new Account("2020-11","홍길둥", 900),
			new Account("2020-12","홍갈등", 900),
			new Account("2020-13","홈길동", 900),
		};
		
		System.out.println(Account.transfer(acc[1], acc[2], 50));
		System.out.println(Account.transfer(acc[1], acc[2], 500));
		System.out.println(Account.transfer(acc[1], acc[2], 500));
		
		//고길동 계좌 검색
	}

}
