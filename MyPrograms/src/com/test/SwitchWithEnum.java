package com.test;

public class SwitchWithEnum {

	enum food {COKE, PEPSI, BEER, MIRINDA};
	public static void main(String[] args) {
		food f = food.BEER;
		switch(f)
		{
			case COKE : 
				System.out.println("collect your Coke");
				break;
			case PEPSI :
				System.out.println("collect your Pepsi");
				break;
			case BEER : 					
				System.out.println("collect your  Beer");
				break;
			case MIRINDA:
				System.out.println("collect your  Mirinda");
				break;
		}
	}

}
