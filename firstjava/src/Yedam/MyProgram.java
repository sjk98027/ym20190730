package Yedam;

import java.util.*;

public class MyProgram {
	static int damage;
	static boolean idle;

	private enum status {
		attack, stay, arround
	};

	private static void Actonpatten(status aN) {
		switch (aN) {
		case attack:
			damage = 4;
			idle = false;

			break;
		case stay:
			damage = 0;
			idle = true;
			break;
		case arround:
			damage = 0;
			idle = false;
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		whileroof();


	}
	
	

	private static void whileroof() {
		int i = 1;
		while (i < 10) {
			int j = 2;
			while (j < 10) {
				if (j % 2 == 0 && i%2 == 0) {
					System.out.print(j + "*" + i + "=" + j * i + "\t");
				}
				j++;

			}
			System.out.println();
			i++;

		}

	}

	private static void matrix() {
		int undonumber;
//		for (int i =1; i<=25; i++) {
//			if(i%5!=0) {
//				System.out.print(i);
//			}
//			else 
//			System.out.println(i);
//		}
//		System.out.println();

		int stack = 0;
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {

				System.out.print(5 * j - stack + " ");

				if (j == 5) {
					System.out.println();

				}

			}
			stack++;

		}

	}

	private static void multi(int x) {
		for (int i = 0; i < 10; i++) {
			System.out.println(x + "*" + i + "=" + x * i);
		}

	}

	private static void act() {
		System.out.println();

		Scanner input = new Scanner(System.in);

		Actonpatten(status.attack);
		System.out.println("" + damage + "" + idle);

		multi(3);

	}

}
