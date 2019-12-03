package DuringUttara;
public class Counting1
{
	public static void main(String[] args)
	{
	for(int i=1; i<=100; i++)
	{
	if(i%11==0)
	System.out.println();
	else
	System.out.print(i+" ");
	}

	System.out.println("\n\n");

	int y = 9;
	for(int j=1; j<=100; j++)
	{
	if(j%11==0)
	System.out.println();
	else
	{
	if(j%6==0)
	System.out.print(6*(y--)+" ");
	else
	System.out.print(j+" ");
	}
	}
	}
}