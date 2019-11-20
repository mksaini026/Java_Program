package com.test;

class TestAdd {

	 protected class test123
	 {
		 static final int a = 5;
	 }
	protected static int sumI(int a, int b)
	{
		System.out.println(a+b);
		return a + b;
	}
	
	private static void sumP(int a, int b)
	{
		sumI(a,b);
		System.out.println(a + b);
	}
	
	
	public static void main(String[] args) {
		int a = 5, sum;
		System.out.println(sumI(1,2));
		sumP(1,4);
		sum = a+sumI(1,4);
		System.out.println(sum);
		//test123 t = new test123();
		System.out.println(test123.a);
	}

}
