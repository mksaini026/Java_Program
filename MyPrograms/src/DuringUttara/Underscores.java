package DuringUttara;
public class Underscores
{
	public static void main(String[] args)
	{
	int val1 = 10000000;              // _10000000 and 100000000_ can not be use
	int val2 = 10_000_______000;
	float val3 = 1000_000.0f;
	double val5 = 1_000000.0_0000;  //10000._000 and 10000_.0000 can not be use
	long val4 = 1000_000l;
	int hex = 0xdead_c0de;
	int bytes = 0x1000_0000;

	System.out.println(val1);
	System.out.println(val2);
	System.out.println(val3);
	System.out.println(val5);
	System.out.println(val4);
	System.out.println(hex);
	System.out.println(bytes);
	}
}