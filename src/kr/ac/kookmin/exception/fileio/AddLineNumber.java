package kr.ac.kookmin.exception.fileio;
import java.io.*;
/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args) throws IOException
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);
       int n = 0;
      try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream(path+"numbered.txt"));

       String str;
         
       while(true)
       {
    	   n++;
    	   str=inputStream.readLine();
    	   if(str==null)
    		   break;
    	   outputStream.println(n+" "+str);
       }

         inputStream.close( );
         outputStream.close( );

         Exception ex = new Exception();
 		throw ex;

      }
      catch(Exception e)
      {
    	  n++;
    	  System.out.printf("asdf");
    	  
      }
   }
}