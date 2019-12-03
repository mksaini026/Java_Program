package com.test;

public class ForFibb 
{
	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 1;
		a[1] = 1;
		for(int i = 2 ; i < a.length ; i++)
		{
			a[i] = a[i-1] + a[i-2];
		}
		for(int i : a)
		{
			//if(i%2 == 0)
				//break;
			System.out.println(i);
		}
	}
}
