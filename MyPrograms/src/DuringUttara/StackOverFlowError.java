package DuringUttara;
class StackOverFlowError
{
	void m1()
	{
		System.out.println("Mon");
		m2();
	}
	void m2()
	{
		System.out.println("Man");
		m1();
	}

	public static void main(String[] args)
	{
		StackOverFlowError t=new StackOverFlowError();
		t.m1();
	}
}