package com.test;

public class StaticVarAccessibility 
{
	static int a=1000; 
	static int b=2000; 
	public static void main(String[] args) //static  method 
	{
		System.out.println(StaticVarAccessibility.a);
		System.out.println(StaticVarAccessibility.b);
		System.out.println(a);
		System.out.println(b);

		StaticVarAccessibility t = new StaticVarAccessibility();
		t.m1();  //instance method calling
		
		
		PowerOfNumber p = new PowerOfNumber();
		System.out.println(p.a); 
		p.a = 20;
		t.m2(p);
		System.out.println("goppa : " + p.a); 
		
		int a = 10;
		System.out.println(a);
		a = 20;
		t.m3(a);
		
	}
	void m1() //instance method
	{
		System.out.println(a);   
		System.out.println(StaticVarAccessibility.b);
	}
	void m3(int a)
	{
		System.out.println(a); 
	}
	void m2(PowerOfNumber p)
	{
		System.out.println("p a " + p); 
		System.out.println("p b " + p.b); 	
		p.a=30;
	}
}

