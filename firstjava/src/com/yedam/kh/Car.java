package com.yedam.kh;

public class Car {
	Tire frontLeft = new Tire("앞왼쪽",6);
	Tire frontRight = new Tire("앞오른쪽쪽",4);
	Tire backLeft = new Tire("뒤왼쪽",5);
	Tire backRight = new Tire("뒤오른쪽",3);
	
	int run() {
		System.out.println("[자동차가 달립니다]");
		if(!frontLeft.roll()) {
			stop();
			return 1;
		}
		
		if(!frontRight.roll()) {
			stop();
			return 2;
		}
		if(!backLeft.roll()) {
			stop();
			return 3;
		}
		
		
		if(!backRight.roll()) {
			stop();
			return 4;
		}
		
		return 0;
	}
	
	private void stop() {
		
	}
	
}
