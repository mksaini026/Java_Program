package DuringUttara;
class Marks
{
	int m1,m2,m3;
	Marks(int m1,int m2,int m3) //local variables
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
};

class StudentInheritance
{
	Marks mk; //without student class no meaning of marks is called "composition"
	String sname;
	int sid;
	StudentInheritance(Marks mk,String sname,int sid) //local variables
	{
		this.mk = mk;
		this.sname = sname;
		this.sid = sid;
	}

	void display()
	{
		System.out.println("student name:-->"+sname);
		System.out.println("student id:-->"+sid);
		System.out.println("student marks:-->"+mk.m1+"---"+mk.m2+"--"+mk.m3);
	}
	public static void main(String[] args)
	{
		Marks m1 = new Marks(10,20,30);
		StudentInheritance s1 = new StudentInheritance(m1,"ratan",111);
		s1.display();
		new StudentInheritance(new Marks(10,20,30),"ratan",111).display();
		Marks m2 = new Marks(100,200,300);
		StudentInheritance s2 = new StudentInheritance(m2,"anu",222);
		s2.display();
		new StudentInheritance(new Marks(100,200,300),"anu",222).display();
	}
}