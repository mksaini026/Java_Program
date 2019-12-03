package com.test;

public class ThisKeyWord {
	int a=100,b=200;   
	
	void add(int a,int b)
	{ 
		System.out.println(a+b);     
		System.out.println(this.a+this.b); //approach-1  //		
		ThisKeyWord t1 = new ThisKeyWord(); //a = 100 b = 200
		this.a += 300;
		System.out.println(this.a); 
		System.out.println(t1.a); 
		t1.a += 400;
		System.out.println(t1.a+t1.b);  //approach-2   

	 }  
	
	public static void main(String[] args)  
	{ 
		ThisKeyWord t = new ThisKeyWord();  //a=100 b=200 
		t.add(10,20);  
		System.out.println(t.a);
		System.out.println(t.b);
		t.add(10, 20);
		System.out.println(t.a);
		System.out.println(t.b);
	} 
}
