package stringPrgm;

public class MeanOf2DArray {

	public static void main(String[] args)
	{
		int[][] a = new int[][] {{1,2,3,4,5},{6,7,8,9,5}};
		int mean, sum=0, count=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				sum += a[i][j];
				count++;
			}
			//count += a[i].length;
		}
		System.out.println(sum);
		mean = sum/count;
		System.out.println(mean);

	}

}
