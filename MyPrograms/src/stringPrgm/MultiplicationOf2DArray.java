package stringPrgm;

public class MultiplicationOf2DArray {

	public static void main(String[] args) 
	{
		int[][] a = new int[][] {{1,2},{6,7},{1,2}};
		int[][] b = new int[][] {{0,1,2},{1,2,3}};
		int[][] c = new int[a.length][b[0].length];
				
		if(a[0].length != b.length)
		{
			System.out.println("Multiplication is not possible");
			return;
		}
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b[0].length; j++)
			{				
				c[i][j] = 0;
				for(int k=0; k < b.length; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
