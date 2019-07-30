package com.yedam.kh;

public class Lesson {
	String className;
	Student[] students;
	double javaAvg() {
		int sum=0;
		for(int i = 0; i<students.length ; i++) {
			sum += students[i].javaScore;
		}
		return sum/students.length;
	}
	
	double dbAvg() {
		int sum=0;
		for(int i = 0; i<students.length ; i++) {
			sum += students[i].dbScore;
		}
		return sum/students.length;
		
	}
	
	
}
