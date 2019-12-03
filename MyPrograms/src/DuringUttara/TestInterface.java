package DuringUttara;
interface it1
{
	void m1();
	void m2();
	void m3();
}

class TestInterface implements it1
{
	public void m1(){ System.out.println("m1-method implementation");}
	public void m2(){ System.out.println("m2-method implementation");}
	public void m3(){ System.out.println("m3-method implementation");}
	
	public static void main(String[] args)
	{
		TestInterface ti = new TestInterface();
		ti.m1(); ti.m2(); ti.m3();
		
		it1 i = new TestInterface();
		i.m1(); i.m2(); i.m3();
	}
}