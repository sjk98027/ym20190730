package com.yedam.kh;

import java.util.Calendar;

public class CalenderExample {

	static Calendar now;

	public static void main(String[] args) {
		now = Calendar.getInstance();
		now.set(2019, 7, 1);
//		System.out.println("올해는" + now.get(Calendar.YEAR));
//		System.out.println("이번달은" + now.get(Calendar.MONTH));
//		System.out.println("오늘은" + now.get(Calendar.DAY_OF_MONTH));
//		// System.out.println("이번달의 마지막날은"+ now.get(Calendar.getac));
//		System.out.println("요일은" + now.get(Calendar.DAY_OF_WEEK));
		// now.set(2017, 7, 1);
		showCal(2019, 7);
	}

	static void showCal(int year, int month) {
		now.set(year, month, 1);

		int value = 1;
		for (int i = 0; i <= getLastDay(month) + now.get(Calendar.DAY_OF_WEEK); i++) {
			if (value == 1) {
				for (int j = 0; j <= now.get(Calendar.DAY_OF_WEEK); j++) {
					System.out.print("\t");
				}
			}

			if (i % 7 != 0) {
				System.out.print(value+ "\t");
			}
			if (i % 7 == 0) {
				System.out.println(value+ "\t");
			}
			value++;

		}

	}

	String returnDay(int sumday) {

		int execInt = sumday % 7;

		switch (execInt) {

		case 0:
			return "일";

		case 1:
			return "월";
		case 2:
			return "화";
		case 3:
			return "수";
		case 4:
			return "목";
		case 5:
			return "금";
		case 6:
			return "토";

		default:
			return "";
		}
	}

	static int getLastDay(int month) {

		switch (month) {
		case 0:
			return 0;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			return 28;
		default:
			return 30;
		}

	}

}
