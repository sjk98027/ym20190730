package com.yedam.kh;

public class Friend {
	String name;
	String phone;

	 Friend() {
		// TODO Auto-generated constructor stub
	}

	Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	void showInfo() {
		System.out.println("이름은+"+name+",연락처는 "+phone);
	}

	
	

}
