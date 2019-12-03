package stringPrgm;

public class StringbufferTest 
{
	public static void main(String[] args)   
	{ 
		StringBuffer sb=new StringBuffer("Manoj     Monika"); 
		System.out.println(sb);  
		System.out.println(sb.delete(6,10));   
		System.out.println(sb);   
		System.out.println(sb.deleteCharAt(5));   
		System.out.println(sb.reverse());    
		StringBuffer sb1=new StringBuffer("Manoj");   
		sb1.append("Monika");   
		System.out.println(sb1); 
		
		StringBuffer sb2=new StringBuffer(sb1);  
		sb2.insert(5," ");   
		System.out.println(sb2); 
		
		StringBuffer sb3=new StringBuffer("hy ratan hi");   
		sb3.replace(0,2,"oye");   
		System.out.println("after replaceing the string:-"+sb3);
		
		StringBuffer sb4 = new StringBuffer("Manoj");
		sb4.insert(5, " Monika");
		System.out.println(sb4);
	}
}
