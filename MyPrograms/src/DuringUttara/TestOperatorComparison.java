package DuringUttara;
class TestOperatorComparison
{
	public static void main(String[] args)
	{
		int value1 = 1;
		int value2 = 2;
		if(value1 == value2)
		System.out.println("value1 == value2");
		if(value1 != value2)
		System.out.println("value1 != value2");
		if(value1 > value2)
		System.out.println("value1 > value2");
		if(value1 < value2)
		System.out.println("value1 < value2");
		if(value1 <= value2)
		System.out.println("value1 <= value2");

		/*int a=10,b=20,c=30;
		System.out.println(a<b || a<c);  //false
		System.out.println(a<b | a<c);  //false*/

		int a=10,b=20,c=30;
		System.out.println(a<b && a++>c);
		System.out.println(a);
		System.out.println(a>b & a++<c);
		System.out.println(a);


	}
}