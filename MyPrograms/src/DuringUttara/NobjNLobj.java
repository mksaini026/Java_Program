package DuringUttara;
class NobjNLobj
{
	void m1()
	{
		System.out.println("m1 method");
	}

	public static void main(String[] args)
	{
		//named object
	   NobjNLobj t = new NobjNLobj();
	   t.m1();
	   //nameless object
	   new NobjNLobj().m1();
	 }
}