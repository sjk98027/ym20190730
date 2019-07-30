package com.yedam.kh;

public class Student {
	String name;
	int javaScore;
	int dbScore;
	
	
	public Student() {

	}

	public Student(String name, int javaScore, int dbScore) {
		super();
		this.name = name;
		this.javaScore = javaScore;
		this.dbScore = dbScore;
	}
	
	int sum() {
		return this.javaScore+this.dbScore;
				
	}
	int avg() {
		return (this.dbScore+this.javaScore)/2;
	}
	
	

}
