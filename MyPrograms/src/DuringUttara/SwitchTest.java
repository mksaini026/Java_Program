package DuringUttara;
class SwitchTest
{
	public static void main(String[] args)
	{
		int a=100;
	switch(a)	//case 1
	{
		case 10 : System.out.println("10");
		break;
		case 20 : System.out.println("20");
		break;
		default : System.out.println("default");
		break;
	}

	switch(a)	//case 2
	{
		case 10 : System.out.println("10");
		case 20 : System.out.println("20");
		default : System.out.println("default");
	}
	switch(a)	//case 3
	{
		case 10 : System.out.println("10");
	}
	switch(a) 	//case 4
	{
		default : System.out.println("default");
	}
	switch(a) 	//case 5
	{

	}
	/*switch(a) 	//case 6 Invalid
	{
		System.out.println("no case and no default");
	}*/
	switch(a)	//case 7 default can be any statement
	{
		default : System.out.println("default");
		break;
		case 10 : System.out.println("10");
		break;
		case 20 : System.out.println("20");
	}
	switch(a)	//case 8 duplicate case label not allowed
	{
			case 10 : System.out.println("10");
			break;
			//case 10 : System.out.println("20");
	}
	switch(a+10)
		{
			case 120 : System.out.println("110");
			break;
			case (20*5)+10 : System.out.println("(20*5)");
	}
	}
}