package com.test;

import java.util.Scanner;

public class UseDelimiter 
{
	public static void main(String args[]) 
	{
		String input = "7,tea,12,coffee";  
		Scanner s = new Scanner(input).useDelimiter(",");     
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.nextInt());   
		System.out.println(s.next());
		System.out.println("Manoj\nMonika");  
		s.close();   
	}

}
