package stringPrgm;

public class MeanOf3_2DArray {

	public static void main(String[] args)
	{
		int[][] a = new int[][] {{1,2,3,4,5},{6,7,8,9,0}};
		int[][] b = new int[][] {{0,1,2,3,4},{1,2,3,4,5}};
		int[][] c = new int[][] {{0,1,2,3,4},{1,2,3,4,5}};
		int mean, sum=0, count=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				sum += a[i][j] + b[i][j] + c[i][j];
				count++;
			}
		}
		System.out.println(sum);
		mean = sum/(count*3);
		System.out.println(mean);

	}

}
