package DuringUttara;
class RecursiveMethod1
{
	static void recursive(int a)
	{
		System.out.println("number is :- "+a);
		if (a==0)
		{
			return;
		}
		recursive(--a);
	}

	public static void main(String[] args)
	{
		RecursiveMethod1.recursive(10);
	}
}