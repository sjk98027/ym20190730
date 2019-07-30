package Yedam;

public class Student {
	public Student() {
		super();
	}

	private String name;
	private String major;
	private int age;
	public int height;

	public Student(String name, String major, int age, int height) {
		super();
		name = this.name;
		major = this.major;
		age = this.age;
		height = this.height;
	}

	public void study() {
		System.out.println("공부하숑!");
	}
	
	public void showHeight() {
		System.out.println("키는"+height+"이다");
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
