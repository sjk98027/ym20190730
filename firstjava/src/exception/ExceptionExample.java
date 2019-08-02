package exception;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			String str1=args[0];
			String str2=args[1];	
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			System.out.println(str1);
			System.out.println(str2);
		}
		
		catch(ArrayIndexOutOfBoundsException  | NumberFormatException e) {
			System.out.println("배열이나 변환불가타입");
			
			//e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("알수없는 예외");
		}
		
	}
	
}
