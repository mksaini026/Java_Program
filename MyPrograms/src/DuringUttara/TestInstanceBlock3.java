package DuringUttara;
class TestInstanceBlock3
{
	int a=m1();      //instance variables

	{ System.out.println("instance block"); }  //instance block

	//int a=m1();      //instance variables

	int m1()
	{
		System.out.println("m1() method called by variable");
		return 100;
	}

	public static void main(String[] args)
	{
		TestInstanceBlock3 t = new TestInstanceBlock3();
		System.out.println("return value = "+t.a);
	}
}