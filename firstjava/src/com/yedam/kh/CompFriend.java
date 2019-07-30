package com.yedam.kh;

public class CompFriend extends Friend {
	String department;
	CompFriend() {
		super();
	}
	
	CompFriend(String name, String phone,String department){
		super(name,phone);
		this.department = department;
	}
	
	
	@Override
	void showInfo() {
		System.out.println("이름은+"+name+",연락처는 "+phone+",부서는"+department );
	}
	
}
