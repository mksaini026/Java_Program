package DuringUttara;
class TestInstanceBlock
{
	{ System.out.println("instance block:logics-1"); }
	{ System.out.println("instance block:logics-2"); }

	TestInstanceBlock()
	{
		System.out.println("0-arg cons");
	}
	TestInstanceBlock(int a)
	{
		System.out.println("1-arg cons ");
	}
	public static void main(String[] args)
	{
		new TestInstanceBlock();
		new TestInstanceBlock(10);
	}
}