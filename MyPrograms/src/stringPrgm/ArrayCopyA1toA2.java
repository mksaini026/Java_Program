package stringPrgm;

import java.util.Arrays;

public class ArrayCopyA1toA2 {

	public static void main(String[] args) 
	{
		//-------------------------------------------------------
		int[] copyfrom={10,20,30,40,50,60,70,80}; 
		int[] copyto = new int[7]; 
		System.arraycopy(copyfrom,1,copyto,0,7);
		for (int cc:copyto)   
		{
			System.out.println("int[] copyto = {"+cc+"};");  
		}
		//--------------------------------------------------------------
		int[] loopCopy = new int[7];
		for(int i=1; i<copyfrom.length; i++)
		{
			copyto[i-1] = copyfrom[i];
			System.out.print(copyto[i-1]+" ");
		}
		System.out.println();
		//---------------------------------------------------------------
		int[] copyfrom1={10,20,30,40,50,60,70,80};  
		int[] newarray = Arrays.copyOfRange(copyfrom1,1,4);  
		for (int aa:newarray)
		{
			System.out.println(aa);   //20 30 40   
		}
	}

}


//String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
//public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
//public String pattern = "(" + zeroTo255 + "\\.){3}" + zeroTo255;
//"(" + zeroTo255 + "(\.|$)){4}"