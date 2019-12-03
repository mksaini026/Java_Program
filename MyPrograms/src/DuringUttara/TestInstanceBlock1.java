package DuringUttara;
class TestInstanceBlock1
{
	{ System.out.println("instance block logics"); }
	TestInstanceBlock1()
	{
		this(10);
		System.out.println("0-arg constructor ");
	}
	TestInstanceBlock1(int a)
	{
		System.out.println("1-arg constructor " +a);
	}
	public static void main(String[] args)
	{
		new TestInstanceBlock1();
		new TestInstanceBlock1(100);
	}
}