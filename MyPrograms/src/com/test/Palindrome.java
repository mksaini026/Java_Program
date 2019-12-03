package com.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		sc.close();
		int r=0, temp=n, pal=0;
		while(n>=1)
		{
			r = n%10;
			r = pal + r;
			pal = r * 10;
			n = n/10;
		}
		System.out.println("given number is Palindrome?");
		System.out.println(r==temp);
		TestAdd.sumI(1,2);
	}
	
}
