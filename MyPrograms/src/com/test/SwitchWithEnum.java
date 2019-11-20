package com.test;

public class SwitchWithEnum {

	enum food {COKE, PEPSI, BEER, MIRINDA};
	public static void main(String[] args) {
		int f = food.BEER.ordinal();
		switch(f)
		{
			case 0 : 
				System.out.println("collect your Coke");
				break;
			case 1 :
				System.out.println("collect your Pepsi");
				break;
			case 2 : 					
				System.out.println("collect your Beer");
				break;
			case 3:
				System.out.println("collect your Mirinda");
				break;
		}
	}

}
