package com.yedam.kh;

import java.util.Scanner;

import javax.naming.ldap.ExtendedRequest;

public class MainClass {

	static Account[] acntAry;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] aAry = { 1, 2, 3, 4, 5, 6 };
		int temp ;
//		aAry[0] = aAry[1];
//		aAry[1] = temp;
		
		
		for(int j =0; j<aAry.length-1;j++){
			for (int i = 0; i < aAry.length-1; i++) {
				if(aAry[i] < aAry[i+1]) {
					temp = aAry[i];
					aAry[i] = aAry[i+1];
					aAry[i+1] = temp;
				}				
			}
		}
		

		for (int i = 0; i < aAry.length; i++) {
			System.out.println(aAry[i]);
		}

	}

	private void friendTest() {
		Friend[] fAry = new Friend[5];
		fAry[0] = new Friend("kyw", "1111");
		fAry[1] = new UniFriend("kyw1", "2222", "영어");
		fAry[2] = new CompFriend("kyw2", "1111", "총무부");

		for (Friend f : fAry) {
			if (f != null)
				f.showInfo();
		}

		boolean end = false;
		while (!end) {
			System.out.println("메뉴 : 1)등록 2)조회 3)종료");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("옵션 : 1)대학동문 2)회사동료 3)친구");
				int option = sc.nextInt();
				if (option == 1) {
					System.out.println("이름 : ");
					String name = sc.next();
					System.out.println("전화번호 : ");
					String phone = sc.next();
					System.out.println("전공: ");
					String major = sc.next();
					UniFriend addFriend = new UniFriend(name, phone, major);
					for (Friend f : fAry) {
						if (f == null) {
							f = addFriend;
							break;
						}
					}

				}
				if (option == 2) {
					System.out.println("이름 : ");
					String name = sc.next();
					System.out.println("전화번호 : ");
					String phone = sc.next();
					System.out.println("부서: ");
					String dept = sc.next();
					CompFriend addFriend = new CompFriend(name, phone, dept);
					for (Friend f : fAry) {
						if (f == null) {
							f = addFriend;
							break;
						}
					}
				}
				if (option == 3) {
					System.out.println("이름 : ");
					String name = sc.next();
					System.out.println("전화번호 : ");
					String phone = sc.next();
					Friend addFriend = new Friend(name, phone);
					for (Friend f : fAry) {
						if (f == null) {
							f = addFriend;
							break;
						}
					}
				}

				break;

			case 2:
				System.out.println("검색하고픈 친구 이름을 적어주세요");
				sc.nextLine();
				String name = sc.nextLine();
				for (Friend f : fAry) {

					if (f != null) {

						if (f.name.equals(name)) {
							f.showInfo();
						}
					}

				}

				break;

			case 3:

				System.out.println("종료");
				end = true;
				break;
			default:
				System.out.println("다시입력하세요");
				break;
			}

		}

		for (Friend f : fAry) {

		}

		// 친구연락처-이름,전화번호
		// 대학동문-이름,전화번호,전공
		// 회사동료-이름,전화번호,부서
		// 배열에 담는 프로그램
		// 이름으로 조회
		// Scanner,while(true){} 메뉴 1)등록2조회)3종료
		// 1 대학동문 이름,전화번호,전공 -저장
		// 2.회사동료 이름,전화번호,부서-저장
		// 3 친구 이름,전화번호,저장

	}

	private void baseballTest() {
		Scanner sc = new Scanner(System.in);
		int inputnumber;
		int[] num = new int[3];
		int[] ans = new int[3];
		for (int i = 0; i < 3; i++) {
			int random = (int) ((Math.random() * 9) + 1);
			for (int j = 0; j < i; j++) {
				if (num[j] == random) {
					break;
				}
				if (i != j)
					continue;
				num[i++] = random;
			}
			System.out.println(num[i]);
		}

		int j = 0;
		while (j < 3) {

			System.out.println("숫자입력 : ");
			inputnumber = sc.nextInt();
			ans[j] = inputnumber;
			j++;
		}

		int strike = 0;
		int ball = 0;
		for (int strk = 0; strk < num.length; strk++) {
			for (int bal = 0; bal < num.length; bal++) {
				if (strk == bal) {
					if (num[strk] == ans[strk]) {
						strike++;
					}
				} else if (num[strk] == ans[bal] || num[bal] == ans[strk]) {
					ball++;
				}

			}
		}
		System.out.println(strike + " + " + ball);

	}

}
