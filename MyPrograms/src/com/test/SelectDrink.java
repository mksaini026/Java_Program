package com.test;
import java.util.Scanner;
public class SelectDrink {

	public static void main(String[] args) throws Exception
	{
		int choice = 5;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose your drink : ");
			System.out.println("1. Coke");
			System.out.println("2. Pepsi");
			System.out.println("3. Beer");
			System.out.println("4. Mirinda");
			System.out.println("5. Exit ");
			System.out.println("Enter your choice");
			
			choice = sc.nextInt();
			switch(choice)
			{
				case 1 : 
					System.out.println("collect your Coke");
					break;
				case 2 :
					System.out.println("collect your Pepsi");
					break;
				case 3 : 					
					System.out.println("collect your  Beer");
					break;
				case 4:
					System.out.println("collect your  Mirinda");
					break;
				case 5 : 
					System.out.println("Thanks for using vending machine");
					break;
				default:
					System.out.println("Enter a valid choice");
			}			
		}while(choice < 5);
		System.out.println("program ended");
	}

}
