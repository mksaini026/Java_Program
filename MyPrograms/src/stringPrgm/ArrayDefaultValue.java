package stringPrgm;

public class ArrayDefaultValue {

	public static void main(String[] args) 
	{
		int[] a = new int[3];  
		for(int aa:a) 
		{
			System.out.println(aa);
		}  
		
		String[] s = new String[3]; 
		s[0]="ratan";
		s[2]="anu";
		for(String ss:s)
		{
			System.out.println(ss);   
		} 
		for(int i=0;i<s.length;i++) 
		{
			if(s[i]==null)
				System.out.println(i);  
		} 
	}

}
