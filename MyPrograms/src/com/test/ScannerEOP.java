package com.test;

import java.util.Scanner;

public class ScannerEOP {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   
		   for(int i = 1; sc.hasNext()== true; i++)
		   {
			   System.out.println(i + "int " + sc.nextInt());
		       System.out.println(i + "line " + sc.nextLine());
		   }

	}

}
