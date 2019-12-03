package DuringUttara;
class Demo
{
	static  { System.out.println("Demo class static block");  }
	void m1()
	{
		System.out.println("Demo class m1 method");
	}
};

class TestStaticBlock1
{
	public static void main(String[] args) throws Exception
	{
		new Demo().m1();

		Class c = Class.forName("Demo");
		Demo d = (Demo)c.newInstance();
		d.m1();
	}
}