package Yedam;

public class MySecondProgram {

	public static void main(String[] args) {

//		calender(2);

		int[] inArray = { 1, 2, 3, 45 };
		int maxValue = 0;
		for (int i = 0; i < inArray.length; i++) {
			if (maxValue < inArray[i])
				;
			maxValue = inArray[i];

		}
		//System.out.println(maxValue);

		String[] strArray = { "a", "b", "c", "d", "e", "f" };

		for(String str: strArray) {
			System.out.println(str);
		}
	}

	static int returnMaxMonth(int month) {

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

	static String returnDay(int sumday) {

		int execInt = sumday % 7;

		switch (execInt) {

		case 0:
			return "ȭ";

		case 1:
			return "��";
		case 2:
			return "��";
		case 3:
			return "��";
		case 4:
			return "��";
		case 5:
			return "��";
		case 6:
			return "��";

		default:
			return "";
		}
	}

	static int returnDayInt(String day) {
		int currentDayInt;
		switch (day) {
		case "월":
			currentDayInt = 0;
			break;
		case "화":
			currentDayInt = 1;
			break;
		case "수":
			currentDayInt = 2;
			break;
		case "��":
			currentDayInt = 3;
			break;
		case "목":
			currentDayInt = 4;
			break;
		case "금":
			currentDayInt = 5;
			break;
		case "토":
			currentDayInt = 6;
			break;

		default:
			currentDayInt = 0;
			break;
		}

		return currentDayInt;

	}

	static String monthFirStrDay(int month) {
		String WeekDay;
		int sumday = 0;
		for (int i = 0; i < month; i++) {

			sumday += returnMaxMonth(i + 1);
		}
		sumday -= returnMaxMonth(month);
		return (returnDay(sumday));
	}

	static void calender(int month) {
		int i;
		int maxvalue = returnMaxMonth(month);
		String currentDay = monthFirStrDay(month);
		int currentDayInt = returnDayInt(currentDay); // 4-> println �����

		for (i = 0; i <= maxvalue - 1;) {
			if (i == 0) {
				int correctionValue;
				switch (currentDayInt) {
				case 0:
					/* ȭ */ correctionValue = 1;
					break;
				case 1:
					/* �� */ correctionValue = 2;
					break;
				case 2:
					/* �� */ correctionValue = 3;
					break;
				case 3:
					/* �� */ correctionValue = 4;
					break;
				case 4:
					/* �� */ correctionValue = 5;
					break;
				case 5:
					/* �� */ correctionValue = 6;
					break;
				case 6:
					/* �� */ correctionValue = 0;
					break;

				default:
					correctionValue = 0;
					break;
				}

				for (int j = 0; j <= correctionValue; j++) {
					System.out.print("\t");
				}
			}

			if (currentDayInt % 7 != 4) {
				System.out.print(i + 1 + currentDay + "\t");
			}

			if (currentDayInt % 7 == 4) {
				System.out.println(i + 1 + currentDay + "\t");

			}

			i++;
			currentDayInt = (currentDayInt + 1) % 7;
//			currentDayInt = value % 7;
			currentDay = returnDay(currentDayInt);

		}
	}
}
