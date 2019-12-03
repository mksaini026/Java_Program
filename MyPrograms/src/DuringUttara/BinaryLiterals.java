package DuringUttara;
public class BinaryLiterals
{
	public static void main(String[] args)
	{
	byte b = 0b101;
	short s1 = 0B111;
	int i1 = 0b100;
	long L1 = 0b0000011111100001;

	System.out.println("b = "+b);
	System.out.println("s1 = "+s1);
	System.out.println("i1 = "+i1);
	System.out.println("L1 = "+L1);

	System.out.println("\n");

	byte b1 = 5;
	byte b2 = 0b101;
	byte b3 = -0b101;
	byte b4 = 0b101_0;

	System.out.println("b1 = "+b1+ "b2 = "+b2);
	System.out.println("b2 = "+b2);
	System.out.println("b3 = "+b3);
	System.out.println("b4 = "+b4);
	System.out.println("is b1 and b2 equal: = "+(b1==b2));
	System.out.println("b2 + 1 = "+(b2+1));
	System.out.println("b3 + 1 = "+(b3+1));
	System.out.println("b4 * 2 = "+(b4*2));
	}
}
