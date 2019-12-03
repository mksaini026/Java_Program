package DuringUttara;
class TestString1
{
	public static void main(String[] args)
	{
	String str = "mogambo1z";
	String res = "";
	for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(c != 'z')
			{
				res = res + (char)(c+1);
			}
				else
				res = res + 'a';
		}
		System.out.println(res);
	}
}