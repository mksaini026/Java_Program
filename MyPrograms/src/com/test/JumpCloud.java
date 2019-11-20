package com.test;

public class JumpCloud {

	static int[] a = {0,0,1,0,0,0,0,0,0};
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i < a.length - 2  ; count++, i++)
		{
			if(a[i+2] == 0)
			{
				i++;
			}
		}
		System.out.print(count);
	}

}
