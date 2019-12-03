package DuringUttara;
class FibonacciSeries4
{
    static int fib(int totalNo)
    {
        if (totalNo <= 1)
            return totalNo;
        return fib(totalNo - 1) + fib(totalNo - 2);
    }

    public static void main(String args[])
    {
        int totalNo = 10;
        System.out.println(fib(totalNo));
    }
}