package kc.ac.kookmin.exception.intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class Test{
    public static void main(String args[])
    {
      	AAA a = new AAA();
    	a.readFile();
    }
} 
class AAA{
	public void readFile()
	{
	   	FileReader in=null;
    	BufferedReader reader = null;
        String path = Test.class.getResource("").getPath();

    	try
		{
			in = new FileReader(path+"a.txt");
			reader = new BufferedReader(in);
			String str;
			while(true)
			{
				str = reader.readLine();
				if(str == null)
					break;
				System.out.println(str);
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try{
			in.close();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
  
	}
	
}