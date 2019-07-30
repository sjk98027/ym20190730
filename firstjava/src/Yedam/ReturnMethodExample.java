package Yedam;

public class ReturnMethodExample {

	public static void main(String[] args) {
		String[] dayStr = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri" };

		int month = 7;

		int tabValue = getDayOfFirstDate(month);

		int value = 1;
		for (int j = 1; j < getLastDay(month) + tabValue ; j++) {
			if (j == 1) {
				for (int i = 1; i < tabValue; i++) {
					System.out.print("\t");
					j++;
				}
			}

			System.out.printf("\t" + value);
			if (j % 7 == 0) {
				System.out.println();
			}
			value++;

		}

//		for (int i = 1; i <= getLastDay(month); i++) {
//			System.out.printf("\t %2d ", i);
//			if (i % 7 == 0) {
//				System.out.println();
//			}
//		}
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

	static int getDayOfFirstDate(int month) {
		if (month == 7) {
			return 2;
		} else if (month == 8) {
			return 5;

		} else if (month == 9) {
			return 1;
		}
		return 0;
	}
}
