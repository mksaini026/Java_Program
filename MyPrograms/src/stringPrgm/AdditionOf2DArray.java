package stringPrgm;

public class AdditionOf2DArray {

	public static void main(String[] args) 
	{
		int[][] a = new int[][] {{1,2,3,4,5},{6,7,8,9,0}};
		int[][] b = new int[][] {{0,1,2,3,4},{1,2,3,4,5}};
		int[][] c = new int[2][5];
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		if(a.length != b.length || a[0].length != b[0].length)
		{
			System.out.println("Addition is not possible");
			return;
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
