import java.util.*;
import java.io.*

public class Reader
{
	public static void main(String [] args) throws IOException
	{
		File inputFile = new File("names-data.txt");
		Scanner fileScanner = new Scanner(inputFile);
		
		while(fileScanner.hasNext())
		{
			String name = fileScanner.nextLine();
			System.out.println(name);
		}WHILE
	}MAIN
}//READER
