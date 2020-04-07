	import java.io.File;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;
	

	class DilFile{
	    public static void main(String[] args) throws IOException 
	    {
	        
	        
	       String upperCase ;
	        String fileToConvert;
	        
	        
	        
	        
	        Scanner keyboard = new Scanner (System.in);
	

	       
	

	        System.out.print(" Enter the Filename : ");
	        String filename1 =keyboard.nextLine();
	        
	         
	         System.out.print(" Enter the Filename : ");
	         String filename2 =keyboard.nextLine();
	        
	         
	         
	         File file2 =new File (filename2);
	         if (file2.exists())
	         { System.out.println( " The file " + filename2 + " already exist. ");
	         System.exit(0);
	         }
	         
	

	        
	        File file = new File (filename1 );
	        Scanner inputFile = new Scanner (file);
	        PrintWriter outputFile = new PrintWriter(filename2);
	        
	           fileToConvert =inputFile.nextLine();
	           upperCase =fileToConvert.toUpperCase();
	         
	          
	       
	         
	         while (inputFile.hasNext())
	        {
	            
	            fileToConvert =inputFile.nextLine();
	            
	            upperCase =fileToConvert.toUpperCase();
	            
	            outputFile.println(upperCase); 
	           
	            
	             System.out.println(upperCase);
	        }
	          
	             inputFile.close();
	             outputFile.close(); 
	             
	    }
	}
	           
