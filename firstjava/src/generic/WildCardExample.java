package generic;

import java.util.Arrays;

class Course<T> {
	private String name;
	private T[] Students;

	public Course(String name, int capacity) {
		this.name = name;
		this.Students = (T[]) new Object[capacity];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getStudent() {
		return Students;
	}

	public void setStudent(T[] students) {
		this.Students = students;
	}

	public void add(T t) {
		for (int i = 0; i < Students.length; i++) {
			if (Students[i] == null) {
				Students[i] = t;
			}
		}
	}

}

class Person {

}

class Worker extends Person {

}

class Stu extends Person {

}

class HighStudent extends Stu {

}

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생" + Arrays.deepToString(course.getStudent()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생" + Arrays.deepToString(course.getStudent()));
	}public static void registerCourseStudent(Course<? extends Stu> course) {
		System.out.println(course.getName() + " 수강생" + Arrays.deepToString(course.getStudent()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인 과정",5);
		Course<Worker> workerCourse = new Course<>("직장인 과정",5);
		Course<Stu> studentCourse = new Course<>("학생과정",5);
		Course<HighStudent> highCourse = new Course<>("고등학생과정",5);
		personCourse.add(new Person());
		personCourse.add(new Worker());
		personCourse.add(new Stu());
		personCourse.add(new HighStudent());
		
//		workerCourse.add(new Person());
		workerCourse.add(new Worker());
//		workerCourse.add(new Stu());
//		workerCourse.add(new HighStudent());
		

//		studentCourse.add(new Person());
//		studentCourse.add(new Worker());
		studentCourse.add(new Stu());
		studentCourse.add(new HighStudent());
		
		
//		highCourse.add(new Person());
//		highCourse.add(new Worker());
//		highCourse.add(new Stu());
		highCourse.add(new HighStudent());
		
		
		
		//매개값 확인 <?>
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highCourse);
		// <? super worker>
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highCourse);

		
		//<?extends sutdent>
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highCourse);
		
		
	}
}
