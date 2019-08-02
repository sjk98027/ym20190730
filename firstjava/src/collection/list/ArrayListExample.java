package collection.list;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> list1 = new LinkedList<>(); //list = arraylist /list2= linkedlist;
		
		long starttime = System.nanoTime();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + list.get(i));
		}
		
		long endtime= System.nanoTime();
		System.out.println(endtime -starttime);
		Iterator<String> iter = list.iterator();

		System.out.println("======");
		starttime = System.nanoTime();
		for(int i=0 ; i< 1000000; i++) {
			list.add(0,"hello");
		}
		
		for(int i=0 ; i< 1000000; i++) {
			list1.add(0,"hello");
		}
		endtime= System.nanoTime();
		System.out.println(endtime -starttime);
		
	}

}
