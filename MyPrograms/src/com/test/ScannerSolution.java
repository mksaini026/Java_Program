package com.test;

import java.util.Scanner;

public class ScannerSolution {

	public static void main(String[] args) 
	{
		
			Scanner scan = new Scanner(System.in);
			
	        int i = scan.nextInt();        
	        double d = scan.nextDouble();
	        String s = scan.nextLine();
	        String s1 = scan.nextLine();
	        String s2 = scan.nextLine();
	        
	        System.out.println("String: " + s2);
	        System.out.println("String: " + s1);
	
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);

	}

}
