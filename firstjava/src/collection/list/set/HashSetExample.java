package collection.list.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	@Override
	public int hashCode() {
		System.out.println(name.hashCode());
		// TODO Auto-generated method stub
		return name.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	String name;
	int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		return name.length()==member.name.length();
		//return (name.equals(member.name) && age==member.age);
	}
	
	
}

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> mSet = new HashSet<>();
		mSet.add(new Member("hone155", 10));
		mSet.add(new Member("hone155", 10));
		System.out.println(mSet.size());
		
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
//		set.add(1);

		Iterator<String> itr = set.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
				
		
	}
}
