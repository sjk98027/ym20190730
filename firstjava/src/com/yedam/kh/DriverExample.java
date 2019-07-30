package com.yedam.kh;

class Vehicle{
	
	void run() {
		System.out.println("술달린다");
	}
}

class Bus extends Vehicle{
	@Override
	void run() {
		System.out.println("버스달린다");
	}
}
class Taxi extends Vehicle{
	@Override
	void run() {
		System.out.println("택시달린다");
	}
}

class Driver{
void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Vehicle v = new Vehicle();
		
		driver.drive(v);
		 v = new Taxi();
		
		driver.drive(v);
		v = new Bus();
				
		driver.drive(v);
	}
}
