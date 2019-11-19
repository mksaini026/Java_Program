package com.test;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		sc.close();
		int r=0, rev=0, temp=n;
		while(n>=1)
		{
			r = n%10;
			r = rev + r;
			rev = r * 10;
			n = n/10;
		}
		System.out.println("reverse of "+temp+" is "+r);
	}

}
