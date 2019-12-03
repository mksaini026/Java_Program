package DuringUttara;
class InsVsSta
{
	int a = 10;
	static int b = 20;
	public static void main(String[] args)
	{
		InsVsSta is = new InsVsSta();
		System.out.println(is.a);
		System.out.println(is.b);

		is.a=111;
		is.b=222;
		System.out.println(is.a);
		System.out.println(is.b);

		InsVsSta is1 = new InsVsSta();
		System.out.println(is1.a);
		System.out.println(is1.b);
		is1.b=444;

		InsVsSta is2 = new InsVsSta();
		System.out.println(is2.a);
		System.out.println(is2.b);
	}
}