package DuringUttara;
class TestAssTerOpe
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		a+=5;  //a=a+5 (a=10+5)
		b-=5;  //b=b-5 (b=20-5)
		System.out.println(a+"  "+b);

		String uname = "ratan";
		String upwd = "anu";
		String status = uname.equals("ratan")&&upwd.equals("anu")?"login success":"login fail";
		System.out.println(status);

		int value1 = 1;
		int value2 = 2;
		boolean  result = value1>value2? true : false;
		System.out.println(result);
	}
}