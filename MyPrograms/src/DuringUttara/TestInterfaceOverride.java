package DuringUttara;
interface Thing
{
	void doSomething();
}

class Tool implements Thing
{
	public void doSomething() { System.out.println("doSomething override Tool implements Thing");}
}

class Spanner extends Tool
{
	public void doSomething() { System.out.println("doSomething override Spanner extends Tool");}
}

class TestInterfaceOverride
{
	public static void main(String[] args)
	{
		Thing th = new Spanner();
		Tool to = new Spanner();
		Spanner sp = new Spanner();

		th.doSomething();
		to.doSomething();
		sp.doSomething();

		Thing th1 = new Tool();
		Tool to1 = new Tool();
		//Spanner sp1 = new Tool();

		th1.doSomething();
		to1.doSomething();
		//sp1.doSomething();

		/*Thing th2 = new Thing();  error: Thing is abstract; cannot be instantiated
		Tool to2 = new Thing();
		Spanner sp2 = new Thing();

		th2.doSomething();
		to2.doSomething();
		sp2.doSomething();*/

	}
}