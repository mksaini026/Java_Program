package stringPrgm;

public class ReverseArray {

	public static void main(String[] args)
	{
		int a[] = {12,34,45,56,67};
		int[] b = new int[5];
		int j = 0;
		for(int i=a.length-1; i>=0; i--)
		{
			b[j] = a[i];
			System.out.println(b[j]);
			j++;
			
		}
		System.out.println("\n\n");
		//------------------------------------------
		int temp=0;
		for(int i=0; i<a.length/2; i++)
		{
			temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		for(int aa : a)
		{
			System.out.println(aa);
		}
		//---------------------------------------
	}

}
