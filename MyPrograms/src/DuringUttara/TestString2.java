package DuringUttara;
class TestString2
{
	public static void main(String[] args)
	{
	String str = "Manoj Kumar Saini";
	String res = "";
	for(int i=str.length()-1; i>=0; i--)
		{
			res += str.charAt(i);
		}
		System.out.println(res);
	}
}