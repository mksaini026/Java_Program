package DuringUttara;
class TestThisKeyword
{
	int a=100, b=200;

	void add(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);

		TestThisKeyword t = new TestThisKeyword();
		System.out.println(t.a+t.b);


	}

	public static void main(String[] args)
	{
		TestThisKeyword t = new TestThisKeyword();
		t.add(10,20);
		int x = t.m1();
		System.out.println("return value ="+x+"\n");

		boolean b = t.m2();System.out.println();
		System.out.println(m2()+"\n");
		t.m2();System.out.println();

		t.m3();
		int s = t.sum(2,3);
		System.out.println("return value = "+s);
		System.out.println("return value = "+sum(3,4));

		System.out.println(m4());
	}

	int m1()
	{
		System.out.println("m1 method");
		return 50;
	}
	static boolean m2()
	{
		System.out.println("Kumar");
		return false;
	}
	String m3()
	{
		System.out.println("Saini");
		return "Saini";
	}

	static int sum(int m, int n)
	{
		System.out.println("sum method");
		return m+n;
	}
	static void m4()
	{
		System.out.println("m4 method");
	}
}