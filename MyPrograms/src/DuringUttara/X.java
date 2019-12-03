package DuringUttara;

public class X
{
int a = 10;
static int b = 15;
static
{
System.out.println("in static init 1 b = "+b);
b = 25;
}
{
System.out.println("in inst init 1 a = "+a);
a = 20;
}
{
System.out.println("in inst init 2 a = "+a);
a = 30;
}
static // does order matter for init execution?
{
System.out.println("in static init 2 b = "+b);
b = 35;
}
public X()
{
System.out.println("in constr of X a = "+a);
a = 40;
}
}

public class Y extends X
{
int c = 10;
static int d = 25;
static
{
System.out.println("in static init 1 d = "+d);
d = 35;
}
static
{
System.out.println("in static init 1 d = "+d);
d = 45;
}
{
System.out.println("in inst init 1 c = "+c);
c = 20;
}
{
System.out.println("in inst init 2 c = "+c);
c = 30;
}
public X()
{
System.out.println("in constr of X c = "+c);
c = 40;
}
}

public class TestX
{
	public static void main(String[] args)
	{
		X obj = new X();
		System.out.println(obj.a);
	}
}