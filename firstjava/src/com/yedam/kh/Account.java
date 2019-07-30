package com.yedam.kh;

public class Account {
	
	public Account () {
		accountNo = "";
		name="";
		balance=0;
	}
	public Account(String accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	// ���¹�ȣ,�̸�,�ܾ�,
	String accountNo;
	String name;
	int balance;

	// �Ա�(deposit),���(withdraw), �ܾ�(checkBalance)

	void deposit(int money) {
		balance += money;
	}

	void withdraw(int money) {
		balance -= money;
	}

	void checkBalance() {
		System.out.println(name+" �ܾ��� ? :"+balance);
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
