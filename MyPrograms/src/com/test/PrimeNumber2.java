package com.test;

public class PrimeNumber2
{
	public static String isPrime(int num)
	{
		if(num < 0)
			return "invalid num!";
		if(num == 0 || num == 1)
			return "no";
		if(num == 2 || num == 3)
			return "yes";
		if((num&1) == 0)  // num & 1 it return LSB of num
			return "no";
		int i = 0;
		for(int n= 3 ; n < num / 2 ; n += 2)
		{
			i++;
			if(num % n == 0)
				return "no";
			
		}
		System.out.println(i);
		return "yes";
		
	}
	public static void main(String[] args)
	{
		int x;
		String result;
		
		x = 0;
		result = PrimeNumber2.isPrime(x);
		System.out.println("is "+x+" prime ? "+result);
		
		x =1;
		result = PrimeNumber2.isPrime(x);
		System.out.println("is "+x+" prime ? "+result);
		
		x = 2;
		result = PrimeNumber2.isPrime(x);
		System.out.println("is "+x+" prime ? "+result);
		
		x = 3;
		result = PrimeNumber2.isPrime(x);
		System.out.println("is "+x+" prime ? "+result);
		
		x =4;
		result = PrimeNumber2.isPrime(x);
		System.out.println("is "+x+" prime ? "+result);
		
		x =7;
		result = PrimeNumber2.isPrime(x);
		System.out.println("is "+x+" prime ? "+result);
		
		x = 20;
		result = PrimeNumber2.isPrime(x);
		System.out.println("is "+x+" prime ? "+result);

		x = -2;
		result = PrimeNumber2.isPrime(x);
		System.out.println("is "+x+" prime ? "+result);

		x = 345;
		result = PrimeNumber2.isPrime(x);
		System.out.println("is "+x+" prime ? "+result);

		x = -1>>>1;
		result = PrimeNumber2.isPrime(x);
		System.out.println("is "+x+" prime ? "+result);

	}
}
