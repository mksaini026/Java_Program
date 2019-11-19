package com.test;

import java.util.Scanner;

public class Test 
{
public static void main(String args[])
{	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Paragraph");
	String str = sc.next();
	
	System.out.println("Enter a Inerger number");
	int n = sc.nextInt();
	
	if(n==0)
	{
		str.toUpperCase();
		System.out.println(str);
	}
	sc.close();
}
}
