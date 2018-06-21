package com.programming.oops;

public class TestCalculatorInterface {

	public static void main(String[] args) {
		Calculator c = new Add();
		int addResult = c.calculate(10, 20);
		System.out.println(addResult);

		Calculator c1 = new Substract();
		int substractResult = c1.calculate(20, 10);
		System.out.println(substractResult);
	}

}
