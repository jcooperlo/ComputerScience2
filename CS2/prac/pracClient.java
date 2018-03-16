import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pracClient
{
	public static void main(String [] args) throws FileNotFoundException
	{
		
		prac p = new prac("readMe.txt");
		
	}
}







/*		int [] numbers = new int[100];
		
		File file = new File("readMe.txt");
		Scanner s = new Scanner(file);
		
		int location = 0;
		while(s.hasNext())
		{
			int num = s.nextInt();
			numbers[location] = num;
			location ++;
		}
		for(int i = 0; i < 11; i++)
		{
			System.out.println(numbers[i]);
		}
	}
}
*/
