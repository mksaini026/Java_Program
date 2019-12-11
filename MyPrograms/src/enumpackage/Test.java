package enumpackage;

enum Week  
{ 
	MON(10),TUE,WED(2,3);  
	
	int a;
	int b;
	Week()  
	{ 
		System.out.println("0-arg cons");  
	}  
	
	Week(int a)  
	{ 
		this.a = a;
		System.out.println("1-arg cons");  
	}  
	
	Week(int a,int b)  
	{ 
		this.a = a;
		this.b = b;
		System.out.println("2-arg cons");  
	}  
	
	public static void main(String[] args)  
	{ 
		System.out.println("enum main method");  
	} 
} 

class Test 
{ 
	public static void main(String[] args)  
	{ 
		Week[] w = Week.values();   
		for (Week ww:w)   
		{ 
			System.out.println(ww + " " + ww.ordinal() + " " + ww.a + " " + ww.b);   
		}  
	} 
}
