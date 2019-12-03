package inheritance;

class Animal {  }; 
class Dog extends Animal {  }; 

public class InstanceOfExample 
{

		public static void main(String[] args)   
		{ 
			InstanceOfExample t = new InstanceOfExample();   
			Animal a = new Animal();   
			Dog d = new Dog();   
			Object o = new Object(); 
		  System.out.println(d instanceof Animal);  //true    
		  System.out.println(a instanceof Object);  //true      
		  System.out.println(a instanceof Dog);  //false   
		  System.out.println(t instanceof Object);  //true    
		  System.out.println(o instanceof Animal);  //false     
		  //System.out.println(t instanceof Animal);  //Incompatible conditional operand types InstanceOfExample and Animal     
		}
	 

}
