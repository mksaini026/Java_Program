package com.test;

public class ThisKeyWord2 
{
	private int a = 100, b = 200;
	
	public int getA()
	{
		return a;
	}
	
	public void setA(int a)
	{
		this.a = a;
	}
	
	private int m1(int a, int b)
	{
		return (this.a + a + this.b + b);
	}
	
	private int m3(int a, int b)
	{
		return (this.a + this.b + this.m2(a, b));
	}
	
	private int m2(int a, int b)
	{
		return (this.a + this.m1(a, b) + this.b); //330+590+200
	}
	
	private void printT()
	{
		System.out.println(this.a);
		System.out.println(this.b);	
		System.out.println();	
	}
	
	private static void printT(ThisKeyWord2 t)
	{
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println();	
	}
	
	public static void main(String[] args)  
	{ 
		ThisKeyWord2 t1 = new ThisKeyWord2(), t2 = new ThisKeyWord2(), t3 = new ThisKeyWord2();
		printT(t1);
		printT(t2);
		printT(t3);
		t1.a = t2.m1(10, 20);
		t3.a = t1.m2(20, 40);
		t2.a = t3.m3(10, 30);
		t1.printT();
		t2.printT();
		t3.printT();

	}
}
