package DuringUttara;
class Student{}
class Emp{}
//class Animal{}
//class Dog{}
class Forest{}

class TestReturnType
{
	Forest m0(Animal a, Dog d, int i)
	{
		System.out.println("m0 method");
		System.out.println(a+" "+d+" "+i);
		Forest f = new Forest();
		return f;
	}
	Emp m1()
	{
	System.out.println("m1 method");
	Emp e = new Emp();
	return e;
	}
	Student m2()
		{
		System.out.println("m2 method");
		Student s = new Student();
		return s;
	}

	public static void main(String[] args)
	{
		TestReturnType t = new TestReturnType();
		Emp e = t.m1();
		System.out.println("return value ="+e);
		Student s = t.m2();
		System.out.println("return value ="+s);
		System.out.println("return value ="+t.m3());
		System.out.println("return value ="+t.m4());

		Animal a = new Animal();
		Dog d = new Dog();
		Forest f = t.m0(a,d,10);
		System.out.println("return value ="+f);
	}
	TestReturnType m3()
	{
		System.out.println("m3 method");
		return this;
	}
	static TestReturnType m4()
	{
		TestReturnType t = new TestReturnType();
		return t;
	}
}