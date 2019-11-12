package collection;

import java.util.HashSet;

public class TestSetAPI {

	public static void main(String[] args) {
		
		String s1 = "ranadheera";
		String s2 = "om";
		String s3 = "a";
		String s4 = "z";
		String s5 = "uppi";
		String s6 = "uppi2";
		String s7 = new String("om");
		
		System.out.println("is s2==s7 ? "+(s2==s7));
		System.out.println("is s2.equals(s7) ? "+s2.equals(s7));
		
		System.out.println("s1.hashCode() = "+s1.hashCode());
		System.out.println("s2.hashCode() = "+s2.hashCode());
		System.out.println("s7.hashCode() = "+s7.hashCode());
		
		HashSet hs = new HashSet(); //ctrl + shift + o => import fqcn
		
		System.out.println("adding s1 "+s1 +" into hs = "+hs.add(s1));
		System.out.println("adding s2 "+s2 +" into hs = "+hs.add(s2));
		System.out.println("adding s3 "+s3 +" into hs = "+hs.add(s3));
		System.out.println("adding s7 "+s7 +" into hs = "+hs.add(s7));
		
		
	}

}