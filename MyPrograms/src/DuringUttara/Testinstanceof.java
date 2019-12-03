package DuringUttara;
class Animal {  };

class Dog extends Animal {  };

class  Testinstanceof
{
	public static void main(String[] args)
	{
		Testinstanceof t = new Testinstanceof();
		Animal a = new Animal();
		Dog d = new Dog();
		Object o = new Object();

 		System.out.println(d instanceof Animal);  //true
 		System.out.println(a instanceof Object);  //true
 		System.out.println(a instanceof Dog);  //false
 		System.out.println(t instanceof Object);  //true
 		//System.out.println(t instanceof Animal);  //error: incompatible types: Testinstanceof cannot be converted to Animal
 		System.out.println(o instanceof Animal);  //false
 		System.out.println(o instanceof Testinstanceof);  //false
 	}
 }