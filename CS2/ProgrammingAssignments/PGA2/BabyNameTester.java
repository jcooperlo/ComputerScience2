import java.util.*;
import java.io.*

public class Tester
{
	public static void main (String [] args)
	{
		int [] r = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Name: ");
		String n = scan.nextLine();

		BabyName name = new BabyName(n, r);
		System.out.println(name.getRanks());
		System.out.println(name.getName());

		System.out.println(name.toString());

		BabyName baby = new BabyName();
		System.out.println(baby.getRanks());
		System.out.println(baby.getName());
		System.out.println(baby.toString());
	}//MAIN
}//TESTER
