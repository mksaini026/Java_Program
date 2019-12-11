package inheritance;

import java.util.Scanner;

public class MethodHidingParent {

	static void m1() 
	{ 
		System.out.println("parent m1()"); 
//		try
//		{
////			Thread.sleep(100);
////			throw new InterruptedException("Message");
//			System.out.println(10/0);
//			int c = 10/0;
//			MethodHidingParent p1 = null;
//			System.out.println(c);
//			for(int i = 0; i < 10 ; i++)
//			{
//				p1.m1();
//			}
//			System.out.print( "After statement");
//			
//		}
//		catch(InterruptedException ex)
//		{
//			System.out.print( ex.getMessage());
//		}
//		catch(ArithmeticException ex)
//		{
//			System.out.print( ex.getMessage());
//		}
//		catch(Throwable ex)
//		{
//			System.out.println( ex.getMessage());
//			ex.printStackTrace();
//		}
//		System.out.println( "After catch");
		
	}
	
	public static void main(String[] args)  
	{ 
		MethodHidingParent p = new MethodHidingParent();   
		p.m1();
		
//		 try(Scanner s = new Scanner(System.in)) 
//		 { 
//			 System.out.println("enter id");  
//			 int a = s.nextInt(); 
//			 System.out.println("input value="+a);  
//		}  
	}
}
