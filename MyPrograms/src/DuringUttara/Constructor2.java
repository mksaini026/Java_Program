package DuringUttara;
class Constructor2
{
	Constructor2(int i)
	{
		System.out.println("1-arg constructor");
	}

	public static void main(String[] args)
	{
		//Constructor2 t1=new Constructor2(); //error : inside the class no 0-arg constructor
		Constructor2 t2=new Constructor2(10);
	}
}