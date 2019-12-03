package stringPrgm;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args)   
	{  
	String str="hi ratan w r u wt bout anushka"; 
	StringTokenizer st = new StringTokenizer(str);    // default splitting character (space symbol)  
	while (st.hasMoreElements())   
	{ 
		System.out.print(st.nextElement() + ";");   
	} 
	System.out.println();
	for(String s : str.split(" "))
	{
		System.out.print(s + ";");  
	}
	System.out.println();
	
	
	//user defined splitting character   
	String str1 = "hi,rata,mf,sdfsdf,ara";  
	StringTokenizer st1 = new StringTokenizer(str1,",");   
	while (st1.hasMoreElements())   {
		System.out.print(st1.nextElement() + " ");   }  
		
	System.out.println();
	for(String s : str1.split(","))
	{
		System.out.print(s + " ");  
	}
	
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
	StringTokenizer st2 = new StringTokenizer(s,",");  	
	System.out.print(st2.countTokens());
	while (st2.hasMoreElements())   {		
		System.out.print(st2.nextElement());   
	}  
    scan.close();
	}

}
