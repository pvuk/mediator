package com.java.statickeyword.example;

public class StaticKeyWordExample {
	private static StaticKeyWordExample myClass = new StaticKeyWordExample();
	private static StaticKeyWordExample myClass2 = new StaticKeyWordExample();

	public StaticKeyWordExample() {
		System.out.println(myClass);
		System.out.println(myClass2);
	}
	
	public static void main(String[] args) {
		
	}
}