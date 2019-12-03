package DuringUttara;
class RecursiveMethod
{
	
	static void recursive(int a)
	{		
		System.out.println("EN : "+a);
		if (a==0)
		{
			return;
		}
		int b = a-1;
			recursive(b);
			System.out.println("EX : "+a);
	}
	
	static int factorial(int a)
	{
		if(a == 1)
		{
			return 1;
		}
		return a * factorial(a-1);		
	}

	static void printFibbonaci()
	{
		//TODO
	}
	public static void main(String[] args)
	{
		RecursiveMethod.recursive(5);
//		System.out.println("EX : ");
		int fact = RecursiveMethod.factorial(5);
		System.out.println("fact :  " + fact);
	}
}
