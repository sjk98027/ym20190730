package nestedClass;

public class Outer {
	
	void method() {
		class F{
			F(){
				System.out.println("F객체 생성");
				
			}
			int fieldF;
			void methodF() {
				System.out.println("F메소드 호출");
			}
			
		}
		F f=new F();
		f.fieldF=0;
		f.methodF();
	}
	//중첩 클래스 C
	class B {
		B() {
			System.out.println("B객체가 생성됨.");
		}

		int filedB;

		void methodB() {
			System.out.println("B메소드 호출");
		}
		
		
	}
	
	static class C{
		C(){
			System.out.println("C객체가 생성됨.");
		}
		int filedC;
		static int filedCC;
		void methodC() {
			System.out.println("C메소드 호출.");
		}
		static void methodCC() {
			System.out.println("CC메소드 호출.");
		}
	}
	
	interface D{
		int filedD=4;
		void methodD() ;
	}
	
	
}
