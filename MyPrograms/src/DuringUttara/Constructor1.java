package DuringUttara;
class Constructor1
{
	void m1()
	{
		System.out.println("m1 method");
	}
	Constructor1()
	{
		System.out.println("0-arg constructor");
	}
	Constructor1(int i)
	{
		System.out.println("1-arg constructor");
	}

	public static void main(String[] args)
	{
		Constructor1 t1=new Constructor1();
		t1.m1();
		Constructor1 t2=new Constructor1(10);
		t1.m1();
		t2.m1();
	}
}