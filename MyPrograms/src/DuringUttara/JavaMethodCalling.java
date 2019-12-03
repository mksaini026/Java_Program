package DuringUttara;
class JavaMethodCalling
{
	void m1()
	{
		m2(100);
		System.out.println("m2 ");
		m2(200);
	}
	void m2(int a)
	{
		System.out.println("m3 "+a);
	}
	public static void main(String[] args)
	{
		JavaMethodCalling t=new JavaMethodCalling();
		t.m1();
	}
}