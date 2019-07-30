package com.yedam.kh;

public class LessionExample {

	public static void main(String[] args) {
		Lesson openFrameClass = new Lesson();
		openFrameClass.students = new Student[10];
		Lesson conversionClass = new Lesson();
		conversionClass.students = new Student[15];
		Lesson pinTechClass = new Lesson();
		pinTechClass.students = new Student[13];
		
		for(int i=0; i<10 ; i++) {
			
			openFrameClass.students[i] = new Student("댕댕이"+i,i*10,i*2+20);
		}
		for(int i=0; i<15 ; i++) {
			
			conversionClass.students[i] = new Student("껄룩이"+i,i*10,i*2+20);
		}
		for(int i=0; i<13 ; i++) {
			pinTechClass.students[i] = new Student("네루미"+i,i*10,i*2+20);
		}
		
		System.out.println("오픈프레임반 자바평균"+openFrameClass.javaAvg());
		System.out.println("오픈프레임반 디비평균"+openFrameClass.dbAvg());
		
		System.out.println("컨버전 자바평균"+openFrameClass.javaAvg());
		System.out.println("컨버전 디비평균"+openFrameClass.dbAvg());
		
		System.out.println("핀테크반 자바평균"+openFrameClass.javaAvg());
		System.out.println("핀테크반 디비평균"+openFrameClass.dbAvg());
		

	}

}
