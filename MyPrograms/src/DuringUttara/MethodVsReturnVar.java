package DuringUttara;
class MethodVsReturnVar
{
	int a=10;
	int m1(int a)
	{
		System.out.println("m1 method");
		return a;
	}
	int m2()
	{
		System.out.println("m2 method");
		return a;
	}
	int m3(int a)
	{
		System.out.println("m3 method");
		return this.a;
	}
	public static void main(String[] args)
	{
		MethodVsReturnVar mr = new MethodVsReturnVar();
		int x= mr.m1(100);
		System.out.println("m1 return value ="+x);

		int y= mr.m2();
		System.out.println("m2 return value ="+y);

		int z= mr.m3(200);
		System.out.println("m3 return value ="+z);
	}
}