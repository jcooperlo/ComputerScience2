public class SolveTowers
{
	public static long recursivePower(long x, long y)
	{
		if(y == 1)
		{
			return x;
		}//if
		
		else
		{
			return x * recursivePower(x, y-1);
		}//else
	}//recursivePower
	
	public static int integerMultiply(int i, int j)
	{
		if(j == 1)
		{
			return i;
		}
		
		else
		{
			return i + integerMultiply(i, j-1);
		}
	}
	
	public static int fibonacci(int f)
	{
		if(f <= 1)
		{
			return 1;
		}
		
		else
		{
			return fibonacci(f-1) + fibonacci(f-2);
		}
	}

	public static int factorial(int t)
	{
		if(t == 1)
		{
			return 1;
		}
		
		else
		{
			return t * factorial(t-1);
		}	
	}
	
	public static void main(String [] args)
	{
		print("3^5 is: "+recursivePower(3,5));
		print("4*7 is: "+integerMultiply(4, 7));
		print("The 5th term in the Fibonacci sequence is: "+fibonacci(5));
		print("6! is: " +factorial(6));
	}//main

	public static void print(String s)
	{
		System.out.println(s);
	}//print
}











/*
	public static void main(String [] arg)
	{
		TowersOfHanoi towers = new TowersOfHanoi(4);
		towers.solve();
		int moves = towers.count();
		System.out.println("Number of moves: " + moves);
	}
}
*/
