package stringPrgm;

public class StringMutable 
{
	static String x = "SSSSSSSS";
	 public static void main(String[] args) {
		 String a = "Hi";
		 String b = "Hi";
		 String c = new String("Hi");
		 String d = new String("Hi");
		 
		 System.out.println(Integer.toHexString(a.hashCode()));
		 System.out.println(Integer.toHexString(b.hashCode()));
		 System.out.println(Integer.toHexString(c.hashCode()));
		 System.out.println(Integer.toHexString(d.hashCode()));
		 System.out.println(System.identityHashCode(a));
		 System.out.println(System.identityHashCode(b));
		 System.out.println(System.identityHashCode(c));
		 System.out.println(System.identityHashCode(d));
		 
		 a = c;
		 c = "Hi";
		 d = a;
		 b = new String("Hi");
		 System.out.println("\n\nGoofed up");
		 System.out.println(Integer.toHexString(a.hashCode()));
		 System.out.println(Integer.toHexString(b.hashCode()));
		 System.out.println(Integer.toHexString(c.hashCode()));
		 System.out.println(Integer.toHexString(d.hashCode()));
		 System.out.println(System.identityHashCode(a));
		 System.out.println(System.identityHashCode(b));
		 System.out.println(System.identityHashCode(c));
		 System.out.println(System.identityHashCode(d));
		 System.out.println(d.toString());
		 StringMutable s = new StringMutable();
		 System.out.println(s.toString());
		 System.out.println(s);
		
		 
		 String x;
		 //System.out.println(x);  //not initialized
//		 System.out.println(StringMutable.x); //null
	 }
	 
	 public String toString()
	 {
		 return x;
	 }
}
