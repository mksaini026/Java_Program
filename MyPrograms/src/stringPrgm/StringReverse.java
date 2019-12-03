package stringPrgm;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) 
	{
        
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        StringBuffer sb = new StringBuffer(A);
        StringBuffer sb1 = new StringBuffer(A);
        StringBuffer s = sb1.reverse();
        
        System.out.println(s);
        
        if(s.compareTo(sb) == 0)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        
        System.out.println( A.equals( new StringBuffer(A).reverse().toString()) ? "Yes" : "No" );
        
        String reverse = "";
        for(int i=A.length()-1; i>=0; i--)
        {
        	reverse = reverse + A.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(A.equals(reverse));
        sc.close();
    }

}
