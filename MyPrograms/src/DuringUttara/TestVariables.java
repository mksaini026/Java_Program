package DuringUttara;
class TestVariables
{
	int p=10, q=20, r=30;
	int i=10, j=20, k;
	int x=10, y, z;
	static int d=10, e, f=30;
	static int a,b,c;

	int m;
	static boolean n;

	public static void main(String[] args)
	{
	TestVariables tv = new TestVariables();
	System.out.println(tv.p+"---"+tv.q+"---"+tv.r);
	System.out.println(tv.i+"---"+tv.j+"---"+tv.k);
	System.out.println(tv.x+"---"+tv.y+"---"+tv.z);
	System.out.println(d+"---"+e+"---"+f);
	System.out.println(TestVariables.d+"---"+TestVariables.e+"---"+TestVariables.f);
	System.out.println(a+"---"+b+"---"+c);
	System.out.println(tv.a+"---"+tv.b+"---"+tv.c);

	System.out.println(tv.m);  //default values
	System.out.println(n);  //default values

	m4();
	tv.m1();
	TestVariables.m2();
	tv.m2();
	m2();
	tv.m3();

	}

	void m1()
	{
		a = 60;
		System.out.println(a+"---"+b+"---"+c);
		System.out.println(d+"---"+e+"---"+f);
		TestVariables tv = new TestVariables();
		System.out.println(tv.p+"---"+tv.q+"---"+tv.r);
	}

	static void m2()
	{
		System.out.println(a+"---"+b);
	}

	void m3()
	{
		System.out.println(a+"---"+b);
	}

	static void m4()
	{
		System.out.println(a+"---"+b);
		TestVariables tv = new TestVariables();
		tv.p = 50;
		System.out.println(tv.p+"---"+tv.q+"---"+tv.r);
	}
}