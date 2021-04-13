package stringPrgm;

import java.util.Locale;

public class StringMethods {
	public static void main(String[] args) 
	{
		Locale l = Locale.FRENCH;
		String m = "Manoj_ Monika";
		String s3= "Hi";
		String s4= "Hi";	
		String s5 = "Manoj";
		String s6 = "Monika";
		String s7 = new String("Manoj");
		String s8 = new String("Manoj");
		
		System.out.println("Length : " + m.length());			//Length : 13
		System.out.println("CharAt : " + m.charAt(4) + m.charAt(6) + m.charAt(5) + "\n");			//CharAt : j _
		System.out.println("Substring : " + m.substring(8));			//Substring : onika
		System.out.println("Substring : " + m.substring(7,9) + "\n");			//Substring : Mo       [9]-not include,means till before [9] 
		System.out.println("Concat : " + m.concat("_Vansu"));				//Concat : Manoj_ Monika_Vansu
		System.out.println("Plus : " + s5 + s6 +"\n");					//Plus : ManojMonika
		System.out.println("IndexOf : " + m.indexOf('M'));				//IndexOf : 0
		System.out.println("IndexOf : " + m.indexOf('M',3));			//IndexOf : 7
		System.out.println("LastIndexOf : " + m.lastIndexOf('M') + "\n");			//LastIndexOf : 7
		System.out.println("LowerCase : " + m.toLowerCase(l));				//LowerCase : manoj_ monika
		System.out.println("UpperCase : " + "Hi".toUpperCase(Locale.FRENCH));			//UpperCase : HI
		System.out.println();
	
		System.out.println("EQUALS : " + "Hi".equals("hi"));			//EQUALS : false
		System.out.println("EqualsIgnoreCase : " + "Hi".equalsIgnoreCase("hi"));			//EqualsIgnoreCase : true
		System.out.println("Equal to : " + ("Hi" == "Hi"));
		System.out.println("Equal to : "+ ("Hi" == "hi"));
		System.out.println("Equals : "  + "Hi".equals("bye"));
		System.out.println("Equals : " + s3.equals(s4));		
		System.out.println("Equal to : " + s3 == s4);
		System.out.println("Equal to : " + (s3 == s4));			
		System.out.println("Equal to with new String : " + (s7 == s8)); // == checks for the address of the object
		System.out.println("Equals with new String : " + (s7.equals(s8))); //While equals method will check for the data 

		System.out.println();
		System.out.println("Compare to : " + s5.compareTo(s6));
		System.out.println("Compare to : " + s5.compareTo("Manoj"));
		System.out.println("Compare to : " + s6.compareTo(s5));
		System.out.println("Compare to : " + s5.compareTo("manoj"));
		System.out.println("Compare to ignore case : " + s5.compareToIgnoreCase("manoj"));
		
		System.out.println();
		System.out.println("Trim : '" + " Manoj       Monika    ".trim() + "'");
//		System.out.println("Trim : '" + " Manoj       Monika    ".strip() + "'");
//		System.out.println("Trim : '" + " Manoj       Monika    ".stripLeading() + "'");
//		System.out.println("Trim : '" + " Manoj       Monika    ".stripTrailing() + "'");
		System.out.println("Replace : " + "Manoj".replace('a', 'i'));
		
		System.out.println();
//		System.out.println("IsBlank space : " + " ".isBlank());
//		System.out.println("IsBlank empty: " + "".isBlank());
//		System.out.println("IsBlank word: " + "man".isBlank());
//		System.out.println("IsBlank new line: " + "\n".isBlank());
//		System.out.println("IsBlank tab: " + "\t".isBlank());
		
		System.out.println("IsEmpty space: " + " ".isEmpty());
		System.out.println("IsEmpty empty: " + "".isEmpty());
		System.out.println("IsEmpty word: " + "man".isEmpty());
		System.out.println("IsEmpty newline: " + "\n".isEmpty());
		System.out.println("IsBlank tab: " + "\t".isEmpty());

		System.out.println();
		for(String pu : "ssss,vvvv,dddd,dfdfd,sdssf".split(","))
			System.out.println(pu);
		
		System.out.println();		
		for(String pu : "ssss1vvvv2dddd3dfdfd4sdssf".split("[0-9]"))				//regex pattern
			System.out.println(pu);
		
		System.out.println();
		System.out.println("Manoj".startsWith("Man"));
		System.out.println("Manoj".endsWith("Monika"));
		System.out.println("Manoj".contains("Man"));
		System.out.println("Manoj".matches("[A-Z][a-z]+"));
//		System.out.println("Ohhhh Manoj...".repeat(6));

		

		

	}

}