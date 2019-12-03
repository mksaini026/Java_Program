package DuringUttara;
class IfElseTest
{
	public static void main(String[] args)
	{
	// case - 1
	int age = 20;
	if(age > 22)
	{System.out.println("if/true body");}
	else
	{System.out.println("else/false body");}

	// case - 2
	if(true)
	System.out.println("if/true body");
	else
	System.out.println("else/false body");

	// case - 3
	if(true)
	{int x = 100;}
	}
}