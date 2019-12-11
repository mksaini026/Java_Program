package iopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws  IOException 
	{
		File f = new File("D:\\Java_Program\\MyPrograms\\bin\\booboo");
		System.out.println(f.mkdir());
		File f1 = new File("D:\\Java_Program\\MyPrograms\\bin","abc.txt" );
		FileInputStream fis = new FileInputStream(f1);  
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		try
		{
			int c; 
			while((c=fis.read())!=-1)    
			{
				System.out.print((char)c);
				fos.write(c);    
			}
			if(true)
				throw new IOException("booboo");
			
			System.out.println("\nread() & write operatoins are completed");  
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
//		finally
//		{
//			//stream closing operations  
//			fis.close();   
//			fos.close(); 
//		}

	}

}
