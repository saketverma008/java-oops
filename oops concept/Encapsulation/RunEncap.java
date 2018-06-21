package com.programming.oops;

public class RunEncap {
	public static void main(String[] args) {
		EncapTest t = new EncapTest();
		t.setName("Saket");
		t.setAge(25);
		t.setIdNum("two");
		System.out.print("Name : " + t.getName() + " Age : " + t.getAge());
	}
}
