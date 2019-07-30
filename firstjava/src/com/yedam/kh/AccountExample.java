package com.yedam.kh;

import java.util.Scanner;

public class AccountExample {
	static Account[] acntAry;
	Scanner sc = new Scanner(System.in);

	public void excute() {

		acntAry = new Account[5];
		boolean breakPoint = true;

		int money;
		while (breakPoint) {
			int menu;
			System.out.println("메뉴를 선택하세요 1신규) 2입금) 3)축므  4)계좌확인 5)종료");
			menu = sc.nextInt();
			Account acnt = new Account();
			switch (menu) {
			case 1:
				createAccount();
				break;
			case 2:
				addBalace();
				break;
			case 3:
				removeBalance();
				break;
			case 4:
				checkBalance();
				break;
			case 5:
				System.out.println("종료");
				breakPoint = false;
				break;

			default:
				System.out.println("다시입력하세요");
				break;
			}

		}

	}

	private void createAccount() {
		System.out.println("신규");
		sc.nextLine();
		System.out.println("계좌번호를 입력하세요");
		String accNo = sc.nextLine();
		System.out.println("이름를 입력하세요");
		String accName = sc.nextLine();
		System.out.println("금액를 입력하세요");
		int accBalance = sc.nextInt();
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] == null) {
				acntAry[i] = new Account(accNo, accName, accBalance);
				break;
			}
			if (i == acntAry.length && acntAry[i] != null) {
				acntAry = extentAccountArry();
				for (int j = 0; j < acntAry.length; j++) {
					if (acntAry[j].accountNo == "") {
						acntAry[j] = new Account(accNo, accName, accBalance);
					}
				}
			}
		}
	}

	private void addBalace() {
		System.out.println("계좌번호를 입력해주세요");
		sc.nextLine();
		String accNo = sc.nextLine();
		if (searchAccount(accNo) != null) {
			Account valAccount = searchAccount(accNo);
			System.out.println("입금");
			System.out.println("입금 금액을 입력하세요");
			int money = sc.nextInt();
			sc.nextLine();

			valAccount.deposit(money);
			valAccount.checkBalance();
		} else {
			System.out.println("없는계좌번호입니다");
		}
	}

	private void removeBalance() {
		System.out.println("계좌번호를 입력해주세요");
		sc.nextLine();
		String accNo = sc.nextLine();
		if (searchAccount(accNo) != null) {
			Account valAccount = searchAccount(accNo);
			System.out.println("출금");
			System.out.println("출금 금액을 입력하세요");
			int money = sc.nextInt();
			sc.nextLine();

			valAccount.withdraw(money);
			valAccount.checkBalance();
		} else {
			System.out.println("없는계좌번호입니다.");
		}
	}

	private void checkBalance() {
		System.out.println("계좌번호를 입력해주세요");
		sc.nextLine();
		String accNo = sc.nextLine();
		if (searchAccount(accNo) != null) {

			Account valAccount = searchAccount(accNo);
			System.out.println("계좌번호 :" + valAccount.accountNo);
			System.out.println("이름 :" + valAccount.name);

			valAccount.checkBalance();
		} else {
			System.out.println("없는계좌번호입니다.");
		}
	}

	private static Account[] extentAccountArry() {
		Account[] extentAcntAry = new Account[acntAry.length + 1];
		for (int i = 0; i < extentAcntAry.length; i++) {
			if (i < extentAcntAry.length - 1) {
				extentAcntAry[i] = acntAry[i];
			} else
				extentAcntAry[i] = new Account();
		}

		return extentAcntAry;
	}

	private static Account searchAccount(String no) {

		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] == null) {
				return null;
			} else

			if (acntAry[i].accountNo.toString().equals(no.toString())) {
				return acntAry[i];

			}

		}
		return null;
	}
}

//입출력 받은값 array 만들어서저장

