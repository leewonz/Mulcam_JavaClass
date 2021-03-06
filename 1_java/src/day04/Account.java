package day04;

public class Account {
	private String num;
	private String name;
	private int money;
	
	public Account() {
		this("", "고갱면", 0);
	}

	public Account(String num, String name, int money) {
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

	public void setMoney(int money) {
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
}
