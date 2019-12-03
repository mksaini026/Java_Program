package DuringUttara;
class TestStaticBlock
{
	static { System.out.println("static block-1");}
	static { System.out.println("static block-2");}

	{    System.out.println("instance block");  }

	TestStaticBlock()
	{
		System.out.println("0-arg cons");
	}

	TestStaticBlock(int a)
	{
		System.out.println("1-arg cons");
	}
	void m1()
	{
		System.out.println("Demo class m1 method");
	}

	public static void main(String[] args)
	{
		new TestStaticBlock().m1();
		new TestStaticBlock(10).m1();
	}
}