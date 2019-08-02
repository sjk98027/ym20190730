package generic;

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}

public class ProductExample {
	public static void main(String[] args) {
		Pair<Integer, String> pair = new Pair(10, "Hong");
		Integer retInt = pair.getKey();
		String retStr = pair.getValue();
	}
}
