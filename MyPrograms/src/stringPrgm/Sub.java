package stringPrgm;

public class Sub 
{
	static void m(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		int a = 5;
		//int b = a-1;
		m(a--);
		System.out.println(a);
//		System.out.println(b);
	}

}
