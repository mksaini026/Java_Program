package com.test;

import java.util.Scanner;

public class CreateSeriesUsingLoop {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        double res;
        
        for(int i=0; i<n; i++)
        {	res=a;
            for(int j=0; j<=i; j++ )
            {
            	res = res + Math.pow(2,j)*b;
            }
            System.out.print((int)res+" ");
        }
        sc.close();
	}

}
