package DuringUttara;
class ReverseString
{
    public static void main(String[] args)
    {
		System.out.println(ReverseString.reverseStringUsingStringBuilder("Manoj Kumar Saini"));

		System.out.println(ReverseString.reverseStringUsingtoCharArray("Manoj Kumar Saini"));

		System.out.println(ReverseString.reverseStringUsingSwappingLogic("Manoj"));

		System.out.println(reverseStringUsingcharAt("Manoj Kumar Saini"));

		System.out.println(ReverseString.reverseStringUsingsplit("Manoj Kumar Saini"));
    }

	public static String reverseStringUsingStringBuilder(String str)
	{
		StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        return sb.toString();
	}

	public static String reverseStringUsingtoCharArray(String str)
	{
	    char ch[]=str.toCharArray();
	    String rev="";
	    for(int i=ch.length-1;i>=0;i--)
	    {
	        rev+=ch[i];
	    }
	    return rev;
	}

	public static String reverseStringUsingSwappingLogic(String str)
	{
		char ch[]=str.toCharArray();
		char rev;
		for(int i=0; i<ch.length/2;i++)
		{
			rev = ch[i];
			ch[i] = ch[ch.length-i-1];
			ch[ch.length-i-1] = rev;
		}
	    return new String(ch);
	}

	public static String reverseStringUsingcharAt(String str)
	{
		String res = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			res += str.charAt(i);
		}
		return res;
	}

	public static String reverseStringUsingsplit(String str)
	{
		String[] sa = str.split(" ");
		String res = "";
		for(int i=sa.length-1; i>=0; i--)
		{
			res += sa[i]+" ";
		}
		return res;
	}

}