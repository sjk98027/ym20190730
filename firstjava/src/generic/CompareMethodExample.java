package generic;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1  = new Pair<>(10,"Hone");
		Pair<Integer, String> p2  = new Pair<Integer,String>(10,"Hone");
		System.out.println(Util.compare(p1, p2));
	}
}
