package nestedClass;

class Outer 
{
	
	void show()  
	{
		for (int i=0;i<2 ;i++ ) 
		{
			class MethodInner
			{
				public void info()
				{
					System.out.println("method local inner class");
				}    
			} 
			System.out.println("manoj");
			new MethodInner().info(); 
			System.out.println("kumar");
		} 
		System.out.println("monika");
	}  
	public static void main(String[] args)  
	{ 
		new Outer().new Inner().method(); 		
	} 
	
	class Inner
	{
		int a;
		void method()
		{
			System.out.println("inner class");
			new Outer().show(); 
		}
	}
} 
