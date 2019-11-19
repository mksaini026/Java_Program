package com.test;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		sc.close();
		int sum=0, r;
		while(n>=1)
		{
			r = n%10;
			sum += r;
			n = n/10;
		}
		System.out.println("sum of digits of give number "+sum);
	}

}
