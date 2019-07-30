package firstjava;

public class First {

	/*
	 * 뻐어어어어어어큐
	 * 
	 * 
	 */
	static void startProgram(int x) {
		int a, b, c; // double,short,byte,long
		a = 1;
		b = 2;
		c = a + b * x;
		System.out.println("Result: " + c);
	}
	static int roof(int a) {
		int sum=0;
		for (int i = 0; i < a; ++i) {
			sum+=i;
		}
		
		return sum;
	}
	static void sum(int x, int y) {
		System.out.println("sum result :" +(x + y));

	}
	static void div(double x,double y) {
		System.out.println("div result:"+ x/y);
		
	}
	static void mod(double x,double y) {

		System.out.println("result 나눈값"+x%y);
		System.out.println("result 나머지"+x%y);
		
	}
	static void avg(double x, double y) {
		System.out.println("avg result:"+(x+y)/2);
	}
	static void introduce(String name,int age,double height) {
		System.out.println("이름은 : "+name+"나이는 : "+age+"키는 : "+height);
		
	}
	
	static int sum2(int a,int b) {
		int result=0;
		for(int i=a; i<b; i++) {
			result += i;
//			System.out.println(result);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
//		introduce("이창호",20,20.5);
//		System.out.println(roof(5));
		System.out.println(sum2(3,10));
		
	}

}
