import java.io.*;
import java.util.Scanner;

public class prac
{
	private int [] names;
	private int [] numbers;
	
	public prac(String fileName)
	{
		try
		{
			File inputFile = new File(fileName);
			Scanner fileScanner = new Scanner(inputFile);
			
			int location = 0;
			while(fileScanner.hasNext())
			{
				names[location] = fileScanner.nextInt();
				location ++;
			
//				for(int i = 0; i < 11; i++)
//				{
//					names[location] = fileScanner.nextInt();
//					location ++;
//				}				
			}//WHILE
		}//TRY
		
		catch(IOException e)
		{
			System.out.println(e.getStackTrace());
		}//CATCH
	
	System.out.println(names[1]);
	
	}//PRAC
/*	
	public String print()
	{
		for(int i = 0; i < names.length; i++)
		{
			return System.out.println(names[i]);
		}
	}//PRINT*/
}//CLASS


//Figure out how to create an array that will read in the file
//and separte each line into its own thing

