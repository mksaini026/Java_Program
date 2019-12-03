package DuringUttara;
class TestLvarToIvar
{
	//instance variables
	int val1;
	int val2;

	void values(int val3,int val4) //local variables
	{
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		//conversion of local to instance (passing local variables values to instance variables)
		this.val1=val2;
		this.val2=val4;
		System.out.println(val1);
		System.out.println(val2);
		val1=val3;
		val2=val4;
		System.out.println(val1);
		System.out.println(val2);
	}
	void add()
	{
		System.out.println(val1+val2);
	}
	void mul()
	{
		System.out.println(val1*val2);
	}

	public static void main(String[] args)
	{
		TestLvarToIvar t = new TestLvarToIvar();
		t.values(10,20);
		t.add();
		t.mul();
	}
}