package DuringUttara;
//Fibonacci Series using recursion in java

class FibonacciSeries2
{
 	static int f1=0,f2=1,f3;

 	static void printFibonacci(int totalNo)
 	{
    if(totalNo>0)
    {
         f3 = f1 + f2;
         f1 = f2;
         f2 = f3;
         System.out.print(" "+f3);
         printFibonacci(totalNo-1);
    }
 	}

 	public static void main(String args[])
 	{
  	int totalNo=10;
  	System.out.print(f1+" "+f2);  //printing 0 and 1
  	printFibonacci(totalNo-2);  //n-2 because 2 numbers are already printed
 	}
}