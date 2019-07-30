package com.yedam.kh;

abstract class Animal {
	public String king;

	public void breathe() {
		System.out.println("숨을쉰다");
	}

	public abstract void sound();}

class Cat extends Animal{

	@Override
	public void sound() {
System.out.println("왈왈");
	}
}
class Dog extends Animal{

	@Override
	public void sound() {
System.out.println("미야옹");
	}
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		
	
	}
		
	
}
