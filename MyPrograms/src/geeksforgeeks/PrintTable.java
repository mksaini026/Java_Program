package geeksforgeeks;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int res = 0;
		
		for(int i=1; i<=10; i++)
		{
			int res = n*i;
			System.out.println(res);
		}

	}

}
