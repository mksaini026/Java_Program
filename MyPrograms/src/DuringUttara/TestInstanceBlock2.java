package DuringUttara;
class TestInstanceBlock2
{
	int eid;
	{ eid=111;}  //instance block

 	TestInstanceBlock2()
 	{
		eid=222;
	} //constructor
	void disp()
	{
		System.out.println("emp id="+eid);
	}
	public static void main(String[] args)
	{
		new TestInstanceBlock2().disp();
	}
};