package nestedClass;

public class OuterExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method();

		Outer.B b = outer.new B();
		b.filedB =10;
		b.methodB();
		
		
		//인스턴스 클래스 생성
		Outer.C c = new Outer.C();
		c.filedC = 10;
		c.methodC();
		Outer.C.methodCC();
		
		//정적클래스 생성
		Outer.C.filedCC =10;
		Outer.C.methodCC();
	}
}
