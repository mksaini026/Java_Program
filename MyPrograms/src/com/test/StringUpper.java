package com.test;

import java.util.Scanner;

public class StringUpper {

	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();

	        int length = A.length() + B.length();
	        System.out.println(length);
	        if(A.charAt(0)>B.charAt(0))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	        
	        String s = A.substring(0,1).toUpperCase()  + A.substring(1) + " " + B.toUpperCase().charAt(0) + B.substring(1);
	        System.out.print(s);
	        
	        sc.close();
	}

}
