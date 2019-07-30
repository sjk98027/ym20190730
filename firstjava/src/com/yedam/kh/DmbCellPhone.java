package com.yedam.kh;

public class DmbCellPhone extends CellPhone{
	
	int channel;
	public DmbCellPhone() {
		super();
	}
	public DmbCellPhone(String model,String color,int channel) {
		super(model,color);
		this.channel=channel;
		
	}
	@Override
	void powerOn() {
		System.out.println("DMB 전원 킨다");
	}
	@Override
	void powerOff() {
		System.out.println("DMB 전원 끈다");
	}
	void turnOnDmb() {
		System.out.println("체널"+channel+"방송수신");
		
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신 멈춤");
	}
	
	void changeChannel(int channel) {
		System.out.println("체널"+channel+"으로 변경");
	}
	
}
