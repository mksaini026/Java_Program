package DuringUttara;
import java.util.*;
public class TestScanner1
{
	public static void main(String args[])
	{
		String input = "7 tea 12 coffee";
		Scanner s = new Scanner(input).useDelimiter("\\s");
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		s.close();
	}
}