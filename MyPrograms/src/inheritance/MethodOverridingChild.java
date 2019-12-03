package inheritance;

public class MethodOverridingChild extends MethodOverridingParent
{
	int c =100;
	static final int a = 10;
	static final int b;
	static
	{
		b=20;
	}
	void m1()  
	{ 
	
		System.out.println("child m1()");  
	} 
	public static void main(String[] args)  
	{ 
		MethodOverridingParent p = new MethodOverridingChild();   
		p.m1();
		System.out.println(p.c);
		MethodOverridingChild c = new MethodOverridingChild();
		c.m1();
		System.out.println(c.c);
		MethodOverridingParent p1 = new MethodOverridingParent();
		p1.m1();
		System.out.println(p1.c);
	}

}
