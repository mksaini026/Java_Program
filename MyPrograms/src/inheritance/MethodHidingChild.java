package inheritance;


public class MethodHidingChild extends MethodHidingParent
{
	static void m1()  
	{ 
	
		System.out.println("child m1()");  
	} 
	public static void main(String[] args)  
	{ 
		MethodHidingParent p = new MethodHidingChild();   
		p.m1();
		MethodHidingChild c = new MethodHidingChild();
		c.m1();
	}

}
