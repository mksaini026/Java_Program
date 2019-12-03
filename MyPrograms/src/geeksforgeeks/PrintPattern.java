package geeksforgeeks;

import java.util.Scanner;

public class PrintPattern
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
			for(int i=n; i>=1; i--)
			{
				for(int k=n; k>=1; k--)
				{
					for(int j=1; j<=i; j++) 
					{
						System.out.print(k+" ");
					}
				}
				System.out.println();
			}
			
		
	}

}
//for N=3 the pattern will be 
//3 3 3 2 2 2 1 1 1
//3 3 2 2 1 1
//3 2 1