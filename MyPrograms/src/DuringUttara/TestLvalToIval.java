package DuringUttara;
import java.util.*;
class TestLvalToIval
{
	int sid;
	void details()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter student id");
		int stid = s.nextInt();
		System.out.println("sid value is ="+sid);
		this.sid=stid;
		System.out.println("sid value is ="+sid);
	}
	void disp()
	{
		System.out.println("student is ="+sid);
	}

	public static void main(String[] args)
	{
		TestLvalToIval t = new TestLvalToIval();
		t.details();
		t.disp();
	}
}