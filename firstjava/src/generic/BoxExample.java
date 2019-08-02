package generic;

class Box<T> {
	private T object;
	public void set(T object) {
		this.object = object;
	}
	public T get() {
		return this.object;
	}
}

class Apple {
	
}
class Orange{
	
}



public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello World");
		String retStr = box.get();
		
		Box<Integer> boxInt = new Box<>();
		boxInt.set(new Integer(10));
		Integer retInt = boxInt.get();
		
		Box<Apple> boxApple = new Box<Apple>();
		Apple retApple = boxApple.get();
		
	}
}
