package com.test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		boolean isPrime = true;
		int i;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				isPrime = false;
				
				break;
			}
		}
		System.out.println(i);
		System.out.println(isPrime);
	}

}
