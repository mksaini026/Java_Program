package nestedClass;

public class StaticOuter 
{
	@Deprecated
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
			new MethodInner().info();
		}
	}

	public static void main(String[] args)  
	{ 
		new StaticOuter.Inner().method(); 		
	} 
	
	static class MainInner
	{
		static int a;
		public static void main(String[] args)  
		{ 
			new StaticOuter.Inner().method(); 		
		} 
	}
	
	
	static class Inner
	{
		int a;
//		@SuppressWarnings("deprecation")
		void method()
		{
			System.out.println("static inner class");
			new StaticOuter().show(); 
		}
	}


}
