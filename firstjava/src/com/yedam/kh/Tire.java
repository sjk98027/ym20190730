package com.yedam.kh;

public class Tire {
	public int maxRotation;
	public int accmulatedRotation;
	public String location;
	public Tire(String location, int maxRotation) {
		this.location=location;
		this.maxRotation =maxRotation;
		
				
				
	}
	
	
	public boolean roll() {
		accmulatedRotation++;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location+"Tire수명" + (maxRotation-accmulatedRotation)+"회");
			return true;
		}
		else
			System.out.println("***" + location + "Tire 펑크 **");
		return false;
				
	}
	
}
