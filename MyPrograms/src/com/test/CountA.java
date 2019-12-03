package com.test;

import java.util.Scanner;

public class CountA {

	private static int countNumberOfA(String s)
	{ 		
		int count = 0;
		for(char ch : s.toCharArray())
		{
			if(ch == 'a')
			{
				count++;
			}
		}
		return count;
	}	
	
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		int repeat = n/s.length();
		int extra = n%s.length();
		String extrastring = s.substring(0,extra);
		System.out.println("extra string " + extrastring);
		int count = countNumberOfA(s) * repeat + countNumberOfA(extrastring);
		System.out.println("number of A : " + count);
	}
}
