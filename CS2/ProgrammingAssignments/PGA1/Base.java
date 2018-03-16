//Author: Cooper Locke
//Task: This program takes in a base 10 number from user and
//coverts it into a base 2. The program also errors out if
//the user enters an invalid base 10 number (i.e. 2A)

import java.util.*;

public class Base
{
 public static void main(String [] args)
 {
  //creates stack, scanner, asks for number, and declares baseTenStr, baseTen, and letter
  Stack c = new Stack();
  Scanner scan = new Scanner(System.in);
  System.out.print("Please enter base 10 number: ");
  String baseTenStr = scan.nextLine();
  int baseTen = 0;    
  boolean letter = false;

  //searches user input for a letter
  for(int i = 0; i < baseTenStr.length(); i++)
  {
   if((baseTenStr.charAt(i) < '0') || (baseTenStr.charAt(i) > '9') && !letter)
   {
    letter = true;
    System.out.print(baseTenStr + " is not a base 10 number.");
   }//if
  }//for

  //changes string to int if there isn't a letter
  if(!letter)
  {
   baseTen = Integer.parseInt(baseTenStr);
  }

  //places '1' or '0' on the stack using remainder
  while(baseTen > 0 && !letter )
  {
   if(baseTen % 2 == 1)
   {
    c.push('1');
   }//else if
   
   else
   {
    c.push('0');
   }//else
   
   baseTen = baseTen / 2;
  
  }//while 
  
  //prints out orinigal string
  if(!letter )
  {
   System.out.print(baseTenStr + " in base 2 is: ");  
  }

  //prints out stack
  while(!c.isEmpty())
  {
   System.out.print(c.pop());
  }//while

  System.out.println(" "); 

 }//main
}//Base
