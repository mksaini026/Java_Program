package DuringUttara;
class TestLogicalBitwiseOpe
{
	public static void main(String[] args)
	{
		int a=10,b=20,c=30;
		System.out.println(a<b || a++<c);
		System.out.println(a);
		System.out.println(a>b || a++<c);
		System.out.println(a);
		System.out.println(a<b | a++<c);
		System.out.println(a+"\n");

		 int value1 = 1;
		 int value2 = 2;
		 if((value1 == 1) && (value2 == 2))
		 System.out.println((value1 == 1) && (value2 == 2));
		 System.out.println("value1 is 1 AND value2 is 2");
		 if((value1 == 1) || (value2 == 1))
		 System.out.println((value1 == 1) || (value2 == 1));
		 System.out.println("value1 is 1 OR value2 is 1");
	}
}