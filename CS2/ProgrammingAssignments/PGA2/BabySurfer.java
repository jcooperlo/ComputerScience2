import java.util.Scanner;
import java.io.*;

public class BabySurfer
{
/*
	public static void display(BabyName bn)
	{
		int [] numbers = b.getRanks();
		System.out.println("Name: " + bn.getName());
		
		for(int i = 0; i < bn.getRanks.length; i++)
		{
			System.out.print((i * 10) + 1900 + " ");
			
			for(int j = (1000 - numbers[ii]); j < 1000; j += 100)
			{
				System.out.print("*");
			}

			System.out.println(" " + numbers[i]);
		}

	}	*/
	public static void main(String [] args)
	{
		int [] numbers = new int[11];
		LinkedQueue<String> LQ = new LinkedQueue<String>();
//		BabyName<String> BN = new BabyName<String>();

//ATTEMPT TO IMPLEMENT BABYNAME AS ANOTHER THING THAT THE PROGRAM USES

		try
		{
			File inputFile = new File("names-data.txt");
			Scanner fileScanner = new Scanner(inputFile);
			
			while(fileScanner.hasNext())
			{
				
				String name = fileScanner.next();
				/*int [] ranks = new int[11];
				for(int i = 0; i < 11; i++)
				{
					ranks[i] = fileScanner.nextInt();
				}
				
				BabyName b = new BabyName(name, ranks);

				LQ.enqueue(b);*/
				
				LQ.enqueue(name);
			}
		}
		
		catch(IOException e)
		{
			System.out.println(e.getStackTrace());
		}
		

		System.out.print("Name: ");
		Scanner input = new Scanner(System.in);
		String babyName = input.nextLine();
		
		boolean found = false;
		while(!found && !LQ.isEmpty() )
		{
			if(!LQ.front().equals(babyName))
			{
				LQ.dequeue();
			}

			else
			{
				found = true;
			}
		}
		
		//Executes if the name is found
		
		if(found)
		{
			//Gets rid of the name to access the ranks
			LQ.dequeue();
			
			//Uses a for loop to changes ranks from Strings to ints
			for(int i = 0; i < 11; i++)
			{
				String numString = LQ.dequeue();
				int numNumber = Integer.parseInt(numString);
				numbers[i] = numNumber;
			}
			
			//Uses a for loop to print out the years, asterisks, and ranks
			for(int i = 0; i < 11; i ++)
			{
				System.out.print((i * 10) + 1900 +  " ");//have it print the year by multiplying by 10 and adding 1000

				for(int j = (1000 - numbers[i]); j > 0; j-=100)
				{
					if(numbers[i] == 0)
						System.out.print("");
					else
						System.out.print("*");
				}//FOR
				
				System.out.println(" " + numbers[i]);

			}//FOR
		}//IF
		
		else if(!found)
		{
			System.out.println("Name not found!");
		}
	}//MAIN
}//CLASS
