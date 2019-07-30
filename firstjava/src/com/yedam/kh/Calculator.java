package com.yedam.kh;

public class Calculator {
	static double multi(double x, double y) {
		return x * y;
	}

	static double div(double x, double y) {
		return x / y;
	}

	int plus(int x, int y) {
		return x + y;
	}

	double avg(int x, int y) {
		return plus(x, y) / 2;
	}

	void println(String message) {
		System.out.println(message);
	}

	void execute() {
		double result = avg(7, 10);
		println("결과값은 ?" + result);
	}

	// method overloading
	// triangle x*y method double areaRectangle()
	// n*n width
	// m*n width*height

	double triangle(double x, double y) {
		return x * y / 2;
	}

	double triangle(int x, int y) {
		return ((double) x + (double) y) / 2;
	}

	double triangle(int x, double y) {

		return ((double) x + (double) y) / 2;
	}

	double triangle(double x, int y) {

		return ((double) x + (double) y) / 2;
	}

	int areaRectangle(int x, int y) {
		return x * y;
	}

	int areaRectangle(int x) {
		return x * x;
	}

}
