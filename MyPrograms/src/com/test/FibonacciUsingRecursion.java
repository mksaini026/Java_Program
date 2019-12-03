package com.test;

public class FibonacciUsingRecursion 
{
	static int recursion(int n)
    {
        if(n <= 1)
        	return n;
        return recursion(n-1) + recursion(n-2);
    }

    public static void main(String args[])
    {
    	int n = 9; 
    	System.out.println(recursion(n)); 
    }

} 