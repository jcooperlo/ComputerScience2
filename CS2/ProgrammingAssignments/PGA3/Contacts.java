import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Contacts
{
	public static char getMenuChoice()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("U  Upflip");
		System.out.println("D  Downflip");
		System.out.println("A  Add New Contact");
		System.out.println("R  Remove Existing Contact");
		System.out.println("Q  Quit");

		System.out.print("Enter your choice: ");
		char choice = s.next().charAt(0);
		return choice;
	}//getMenuChoice

	public static void main(String [] args)
	{	
		DoubleLinkedList<String> DLL = new DoubleLinkedList<String>();
		char choice = getMenuChoice();
		Scanner a = new Scanner(System.in);
		Scanner r = new Scanner(System.in);
		String alphaName = "";		
		String removeName = "";

		try
		{
			File inputFile = new File("funnynames.txt");
			Scanner fileScanner = new Scanner(inputFile);

			while(fileScanner.hasNext())
			{
				String name = fileScanner.nextLine();
				DLL.addTail(name);
			}
		}

		catch(IOException e)
		{
			System.out.println(e.getStackTrace());
		}

		while(choice != 'Q')
		{	
			if(choice != 'U' && choice != 'D' && choice != 'A' && choice != 'R')
			{
				System.out.println("Invalid entry. Try again.");
				choice = getMenuChoice();
			}
			
			switch(choice)
			{
				case 'U': System.out.println(DLL.toString()); break;
				case 'D': System.out.println(DLL.rToString()); break;
				case 'A': System.out.print("Enter new contact: ");
					  alphaName = a.nextLine();
					  DLL.addAlpha(alphaName);
					  break;
				case 'R': System.out.print("What contact would you like to remove? ");
					  removeName = r.nextLine();
					  DLL.remove(removeName);
					  break;				
			}
		choice = getMenuChoice();
		}
		System.out.println("Thank you and Goodbye.");
	}
}

