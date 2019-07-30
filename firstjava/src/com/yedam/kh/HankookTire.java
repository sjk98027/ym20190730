package com.yedam.kh;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		accmulatedRotation++;
		if (accmulatedRotation < maxRotation) {
			System.out.println(location + "Tire수명" + (maxRotation - accmulatedRotation) + "회");
			return true;
		} else
			System.out.println("***" + location + "Tire 펑크 **");
		return false;
	}

}
