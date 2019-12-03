package DuringUttara;

class AddMulMethod
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args)
	{
		AddMulMethod t = new AddMulMethod();
		t.add(5,8);
		t.mul(10,20);
	}
}