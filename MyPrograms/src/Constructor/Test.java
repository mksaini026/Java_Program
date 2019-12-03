package Constructor;

public class Test {
	public static void main(String[] args) throws Exception  
	{ 
		 new Demo().m1(); 
		Class c = Class.forName("Demo");   
		Demo d = (Demo)c.newInstance();   
		d.m1(); 

}}
