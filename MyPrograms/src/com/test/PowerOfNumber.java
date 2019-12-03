package com.test;

public class PowerOfNumber {

	public int a = 10;
	public int b =20;
	public static void main(String[] args) {
		
		double res = Math.pow(2,3);
		System.out.println(res);
		System.out.println(StaticVarAccessibility.a);
		StaticVarAccessibility.main(null);
		
	}

}
