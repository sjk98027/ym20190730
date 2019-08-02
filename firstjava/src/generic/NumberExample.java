package generic;

public class NumberExample {
	public static void main(String[] args) {
		int result = Util.compare(10, 20);
		System.out.println(result);
		compareStr("abc","abdc");
	}
	
	static String compareStr(String st1, String st2) {
		if(st1.length() > st2.length()) {
			return st1;
		}
		else
			return st2;
				
	}
}
