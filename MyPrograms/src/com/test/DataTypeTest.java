package com.test;

import java.util.Scanner;

public class DataTypeTest {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
        	try
        	{
        	 long x=sc.nextLong();
             
             
             if(x>=-128 && x<=127)
             {
            	 	System.out.println(x+" can be fitted in:");
            	 	System.out.println("* byte");
        	 		System.out.println("* short");
        	 		System.out.println("* int");
        	 		System.out.println("* long");
             }
             else if(x>= -32768 && x<= 32767)
             {
            	 System.out.println(x+" can be fitted in:");
            	 System.out.println("* short");
            	 System.out.println("* int");
            	 System.out.println("* long");
             }
             else if(x>= -2147483648 && x<= 2147483647)
             {
            	 System.out.println(x+" can be fitted in:");
            	 System.out.println("* int");
            	 System.out.println("* long");
             }   
             else if(x>= -Math.pow(2,63) && x<= Math.pow(2,63)-1)
             {
            	 System.out.println(x+" can be fitted in:");
            	 System.out.println("* long");
             }
        	}
             catch(Exception e)
             {
                 System.out.println(sc.next()+" can't be fitted anywhere.");
             }

        }
		

	}

}
