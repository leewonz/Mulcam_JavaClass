package day04;

public class AccountMgr {
	Account[] accounts;
	int count;
	
	public AccountMgr() {
		accounts = new Account[10];
	}
	
	public AccountMgr(int size) {
		accounts = new Account[size];
	}
	
	public void add(Account acc) {
		if (count == accounts.length) {
			Account[] temp = new Account[accounts.length * 2];
			System.arraycopy(accounts, 0, temp, 0, accounts.length);
			accounts = temp;
			temp = null;
		}
		accounts[count++] = acc;
	}
	
	public void print() {
		for(int i = 0; i < count; i++) {
			accounts[i].print();
		}
		if(count == 0) {
			System.out.println("계좌정보 없음");
		}
	}
}
