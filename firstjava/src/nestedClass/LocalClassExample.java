package nestedClass;

public class LocalClassExample {
	static String regularExpress = "[^0-9]";
	public static void validatePhoneNumber(String pNo1, String pNo2) {
		final int numberLength = 10;
		class PhoneNumber{
			String formattedPhoneNumber = null;
			PhoneNumber(String phoneNumber){
				String currentNumber = phoneNumber.replaceAll(regularExpress, "");
				if (currentNumber.length() == numberLength) {
					formattedPhoneNumber = currentNumber;
				}
				else
					formattedPhoneNumber = null;
			}
			
			public String getNumber() {
				return formattedPhoneNumber;
			}
		}
		
		PhoneNumber myNo1 = new PhoneNumber(pNo1);
		PhoneNumber myNo2 = new PhoneNumber(pNo2);
		if(myNo1.getNumber() == null) {
			System.out.println("myno1 번호없다.");
		}
		else
			System.out.println(myNo1.getNumber());
		if(myNo2.getNumber() == null) {
			System.out.println("myno2 번호없다.");
		}
		else
			System.out.println(myNo2.getNumber());
		
		
	}
		public static void main(String[] args) {
			validatePhoneNumber("12-3456-7890", "4567-1123");
		}
	

}
