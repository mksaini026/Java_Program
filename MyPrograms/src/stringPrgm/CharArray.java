package stringPrgm;

public class CharArray 
{
	public static void main(String[] args) 
	{
		
		String a = "Manojmanoj";
		String b = "Majonmanoj";
		
		
		/*************** 1st way ********************/
		int[] countA = new int[26];
		int[] countB = new int[26];
		for(char c : a.toUpperCase().toCharArray())
		{			
			countA[c-65]++;
		}
		for(char c : b.toUpperCase().toCharArray())
		{			
			countB[c-65]++;
		}
		boolean isAnagram = true;
		for(int i = 0 ; i < 26 ; i++)
		{  
			System.out.println((char)(65+i) +" " + i + " " + countA[i] + " " + countB[i]);
			if(countA[i] != countB[i])
			{
				isAnagram = false;
				break;
			}
		}
		System.out.println(isAnagram);
		
		/*************** 2nd way ********************/
	}

}
