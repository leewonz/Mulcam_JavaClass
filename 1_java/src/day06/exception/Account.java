package day06.exception;

public class Account {
	private String num;
	private String name;
	private int money;
	
	public Account() throws MoneyException {
		this("", "고갱면", 0);
	}

	public Account(String num, String name, int money) 
				     throws MoneyException {
		this.num = num;
		this.name = name;
		this.setMoney(money);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) throws MoneyException {
		if (money < 0) {throw new MoneyException();}
		this.money = money;
	}

	public void input(int money) {
		this.money += money;
		return;
	}
	
	public int output(int money) {
		if(this.money < money) {
			return 0;
		}
		this.money -= money;
		return money;
	}
	
	public void print() {
		System.out.printf("[계좌번호:%s(%s):%d원%n", num, name, money);
	}
	
	public static boolean transfer(Account from, Account to, int money) {
		if(from == null || to == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return false;
		}
		if (from.money < money) {
			System.out.println("잔액이 부족합니다.");
			return false;
		}
		
		from.money -= money;
		to.money += money;
		System.out.printf("계좌이체 완료: %s에서 %s로 %d원 송금%n",
						  from.getName(),
						  to.getName(),
						  money);
		return true;
	}

	@Override
	public String toString() {
		return "Account [num=" + num + ", name=" + name + ", money=" + money + "]";
	}
	
	
}
