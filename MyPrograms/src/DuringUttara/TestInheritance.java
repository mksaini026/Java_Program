package DuringUttara;
class Test1
{
	int a;
	int b;
	Test1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
};

class Test2
{
	boolean b1;
	boolean b2;
	Test2(boolean b1,boolean b2)
	{
		this.b1=b1;
		this.b2=b2;
	}
};

class Test3
{
	char ch1;
	char ch2;
	Test3(char ch1,char ch2)
	{
		this.ch1=ch1;
		this.ch2=ch2;
	}
};

class TestInheritance
{	//instance variables
	Test1 t1;
	Test2 t2;
	Test3 t3;
	TestInheritance(Test1 t1 ,Test2 t2,Test3 t3)//local variables
	{
		//conversion of local-instance
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	void display()
	{
		System.out.println("Test1 object values:-"+t1.a+"----- "+t1.b);
		System.out.println("Test2 object values:-"+t2.b1+"----- "+t2.b2);
		System.out.println("Test3 object values:-"+t3.ch1+"----- "+t3.ch2);
	}

	public static void main(String[] args)
	{
		Test1 t = new Test1(10,20);
		Test2 tt = new Test2(true,true);
		Test3 ttt = new Test3('a','b');
		TestInheritance main = new TestInheritance(t,tt,ttt);
		main.display();

		TestInheritance main1 = new TestInheritance(new Test1(10,20),new Test2(true,false),new Test3('a','b'));
		main1.display();
	}
};