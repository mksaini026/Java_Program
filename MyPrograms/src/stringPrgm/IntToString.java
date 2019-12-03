package stringPrgm;
import java.util.Scanner;

public class IntToString 
{
	public static void main(String[] args) 
	{
//		String s = String.valueOf(n);
//		String s = Integer.toString(n);
//		String s = "" + n;

		   Scanner in = new Scanner(System.in);
		   int n = in .nextInt();
		   String s= String.valueOf(n);
		   
		   if (n == Integer.parseInt(s)) 
		   {
		    System.out.println("Good job");
		   }
		   else 
		   {
		    System.out.println("Wrong answer.");
		   }
		   
		   in.close();
	}

}
