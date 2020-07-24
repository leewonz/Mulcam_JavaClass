package day06.exception;

public class Test05_Account {

	public static void main(String[] args) {
		
		Account account;
		
		try {
			account = new Account("202011", "홍길동", -500);
		} catch (MoneyException e) {
			System.out.println(e.getMessage());
		}
	}

}
