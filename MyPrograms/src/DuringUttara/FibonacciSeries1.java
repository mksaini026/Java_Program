package DuringUttara;
//Fibonacci Series in Java without using recursion

class FibonacciSeries1
{
	public static void main(String args[])
	{
	int f1=0,f2=1,f3,i,totalNo=20;
 	System.out.print(f1+" "+f2);  //printing 0 and 1

 	for(i=2;i<totalNo;i++)  //loop starts from 2 because 0 and 1 are already printed
 	{
  	f3=f1+f2;
  	System.out.print(" "+f3);
  	f1=f2;
  	f2=f3;
 	}
  	}
}