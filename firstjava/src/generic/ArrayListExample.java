package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		list.add(new Student("hong", 10));
		list.add(new Student("kang", 11));
		list.add(new Student("kim", 12));
		int cnt = 0;
		while (cnt < 3) {
			System.out.println("이름입력");
			String name = sc.nextLine();
			System.out.println("나이입력");
			int age = sc.nextInt(); sc.nextLine();
			list.add(new Student(name, age));
			cnt++;
		}

		for (Student st : list) {
			//if (st.getName().equals("hong")) {
				System.out.println(st.getAge() + "  " + st.getName());
			//}
		}
	}

}

class Student {
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
