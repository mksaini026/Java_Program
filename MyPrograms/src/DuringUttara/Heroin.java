package DuringUttara;
class Address
{
	int hno;   //instance variables
	String state;
	String country;
	Address(int hno,String state,String country) //local variables
	{   //conversion process
		this.hno=hno;
		this.state= state;
		this.country = country;
	}
};

class Heroin
{
	String hname;
	int hage;
	Address addr; //reference of address class [hno,state,country]
	Heroin(String hname,int hage,Address addr)
	{ //conversion process
		this.hname = hname;
		this.hage = hage;
		this.addr = addr;
	}
	void display()
	{
		System.out.println("heroin name-->"+hname);
		System.out.println("heroin age-->"+hage);
		System.out.println("heroin address-->"+addr.country+" "+addr.state+" "+addr.hno);
	}

	public static void main(String[] args)
	{
		Address a1  = new Address(111,"banglore","india");
		Heroin h1 = new Heroin("anushka",30,a1);
		h1.display();
		// new Heroin("anushka",30,new Address("india","banglore",111)).display();

  		Address a2  = new Address(333,"california","US");
  		Heroin h2 = new Heroin("AJ",40,a2);
  		h2.display();
  		// new Heroin("AJ",40,new Address("US","california",333)).display();
  	}
}