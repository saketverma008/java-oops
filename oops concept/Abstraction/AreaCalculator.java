package com.programming.oops;

public abstract class AreaCalculator {

	int a;
	
	public AreaCalculator() {
		this.a = 10;
		System.out.println("Called my Parent !!");
	}

	protected int calculateArea(int a, int b) {
		return a * b;
	}

	protected float calculateArea(int a) {
		return  (float) (3.14 * a * a);
	}

	public static void main(String[] args) {
		System.out.println();
	}

}
