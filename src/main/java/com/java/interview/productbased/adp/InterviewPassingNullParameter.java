package com.java.interview.productbased.adp;

public class InterviewPassingNullParameter {

	public static void main(String[] args) {
		method(null);
	}

	private static void method(Object o) {
		System.out.println("Object is null");
	}
	
	private static void method(String s) {
		System.out.println("String is null");
	}
}
