package com.programming.oops;

public class TestArea extends AreaCalculator {

	public String num;

	public TestArea(String string) { /* constructor */
		super();
		System.out.println(string);
	}

	public static void main(String[] args) {

		TestArea t = new TestArea("Rohit");
		System.out.println(t.a);
		System.out.println(t.calculateArea(3));
		System.out.println(t.calculateArea(2, 3));
	}

}
