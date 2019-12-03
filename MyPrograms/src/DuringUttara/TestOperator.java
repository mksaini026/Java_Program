package DuringUttara;
class TestOperator
{
	public static void main(String[] args)
	{
		int a=10;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a+"\n");

		byte b1=-11;
		System.out.println(b1);
		byte b2=+10;
		System.out.println(b2+"\n");
		int c = b1+b2;
		System.out.println(c);
		System.out.println(-b1);
		System.out.println(~b1);
		System.out.println(~b2);
		boolean m=true;
		System.out.println(!m);

		byte d = 15;
		d = d--;
		System.out.println(d);
		System.out.println(~d+"\n");

		a = 20;
		System.out.println(a++ + ++a );
		System.out.println(a++ - ++a );
		System.out.println(a-- + --a );
		System.out.println(a-- - --a );
		System.out.println(a++ + ++a + --a + a--);
		System.out.println(a++ - ++a - --a - a--+"\n");

		int b=20;
		a=10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(10*10/5+3-1*4/2);
	}
}