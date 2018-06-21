package com.programming.oops;

class Animal {
	public void sound() {
		System.out.println("This is my sound");
	}
}

	public class PolymorphismPractice extends Animal {
		public void sound() {
			System.out.println("This is animal's sound");
		}
	public static void main(String[] args) {
		Animal s = new PolymorphismPractice();
		s.sound();
	}

}
