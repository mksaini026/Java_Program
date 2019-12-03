package stringPrgm;

public class CreateString {

	public static void main(String[] args) {
		String s = "Manoj";
		String s1 = "Monika";
		String s2 = new String("manoj");
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(Integer.toHexString(s.hashCode()));
		System.out.println(Integer.toHexString(s1.hashCode()));
		System.out.println(Integer.toHexString(s2.hashCode()));
		

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}

}
