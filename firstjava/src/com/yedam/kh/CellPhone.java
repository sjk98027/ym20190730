package com.yedam.kh;

public class CellPhone {

	String model;
	String color;
	public CellPhone() {
		
	}
	public CellPhone(String model,String color) {
		this.model = model;
		this.color = color;
		
	}
	
	void powerOn() {
		System.out.println("poweron");
		
	}
	void powerOff() {
		System.out.println("poweroff");
	}
	void bell() {
		System.out.println("벨이울린다");
	}
}
