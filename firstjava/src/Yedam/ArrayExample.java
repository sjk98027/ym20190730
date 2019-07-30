package Yedam;

public class ArrayExample {

	public static void main(String[] args) {
		int[] intAry = new int[5];
		int[][] doubleAry = new int[5][5];
		int a = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				doubleAry[i][j] = a++;

			}

		}
		
		for(int j =4; j>= 0; j--) {
			for(int i =0; i< 5 ; i++) {
				
				System.out.print("\t"+doubleAry[i][j]);
			}
			System.out.println();
			
		}

	}

}
