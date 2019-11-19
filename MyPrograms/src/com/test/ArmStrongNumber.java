package com.test;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int sum=0,r,temp=n;		
		while(n>=1)
		{
			r = n%10;
			sum += r*r*r;
			n = n/10;
		}
		System.out.println(sum);		
		System.out.println(sum==temp);
	}

}
