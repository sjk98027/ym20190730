package Yedam;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		String name = "";
		Student[] stuArr = new Student[3];
		int a = 0;
		while (true) {
			System.out.println("이름을 입력하세요");
			Student s1 = new Student();
//			s1.setName(name);
			stuArr[a] = s1;

			name = sc.nextLine();
			
			a++;
			if (a >= 3)
				break;
		}

//		stuArr[0] = st1;
//		stuArr[1] = st2;
//		stuArr[2] = st3;
//		for (Student st : stuArr) {
//			System.out.println(st.getName());
//		}

	}

	class Employee {

		Employee() {

		}

		private int employee_id;
		private String last_name;
		private String first_name;

		public int getEmployee_id() {
			return employee_id;
		}

		public void setEmployee_id(int employee_id) {
			this.employee_id = employee_id;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

	}

}
