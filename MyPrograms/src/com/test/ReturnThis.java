package com.test;

public class ReturnThis 
{
	int a = 10;
	ReturnThis m1()  
	{
		System.out.println("m2 method");  
		return this;
	} 
	static ReturnThis m2(ReturnThis t)  
	{ 
		System.out.println("m1 method"); 
		//ReturnThis t = new ReturnThis(); 
		return new ReturnThis(); 
	} 
	
	public static void main(String[] args)  
	{
		ReturnThis t = new ReturnThis();
		t.a = 50;
		ReturnThis t1 = t.m1(); // ReturnThis t1 = t;
		System.out.println("return value="+t1.a);
		System.out.println("return value="+t.a);
		t1.a = 60;
		System.out.println("return value="+t1.a);
		System.out.println("return value="+t.a);
		
		System.out.println("return value="+t);   
		System.out.println("return value="+t1);   
		ReturnThis t2 = ReturnThis.m2(t1);
		t2.a = 70;
		System.out.println("return value="+t2); 
		System.out.println("return value="+t1.a);
		System.out.println("return value="+t2.a);
		System.out.println("return value="+t.a);
		}

}
