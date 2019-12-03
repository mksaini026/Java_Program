package DuringUttara;
class TestString
{
	public static void main(String[] args)
	{
	String str = "this is it";
	String[] sa = str.split(" ");
	String res = "";
	for(int i=0; i<sa.length-1; i++)
		{
			res = res + sa[i];
		}
		res = sa[sa.length-1]+res+(int)(Math.random()*10);
		System.out.println(res);    //itthisis5
	}
}

