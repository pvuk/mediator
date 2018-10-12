package com.java.statickeyword.example;

public class StaticKeyWordInitializationExample {
	
		private static int testVar = 5;
		private int insVar;
	
		
		public StaticKeyWordInitializationExample(int insVar) {
			this.insVar = insVar;
		}
		
		public static void main(String[] args) {
			StaticKeyWordInitializationExample f = new StaticKeyWordInitializationExample(7);
			System.out.println(f.testVar);
	//		StaticKeyWordInitializationExample.testVar = 16;
			StaticKeyWordInitializationExample s = new StaticKeyWordInitializationExample(8);
			s.testVar = 17;
			System.out.println(s.testVar);
			System.out.println(s.insVar);
			StaticKeyWordInitializationExample t = new StaticKeyWordInitializationExample(9);
			System.out.println(t.testVar);
			System.out.println(t.insVar);
	//		System.out.println(f.testVar);
			System.out.println(f.insVar);
		}
	
}

