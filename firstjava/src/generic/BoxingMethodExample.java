package generic;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box = Util.boxing(new Integer(10));
		Integer retVal =  box.get();
		System.out.println(retVal);
	}
	
}
