import java.util.*;
public class StackTester
{
 public static void main (String [] args)
 {

  CharStack c = new CharStack();
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter here>");
  String exp  = scan.nextLine(); 
  boolean errorFlag = false;  

   
  for(int i = 0; i < exp.length(); i++)
  {

   if(exp.charAt(i) == '(')
   {
    c.push(exp.charAt(i));
   }//if

   else if(exp.charAt(i) == ')')
   {
    if(!c.isEmpty())
    {
     c.pop();
    }//if

    else
    {
     errorFlag = true;
    }//else

   }//else if

  }//for

  if((c.isEmpty()) && !(errorFlag))
  {
   System.out.println("Parentheses are good");
  }

  else if(!c.isEmpty())
  {
   System.out.println("Too many left parentheses");
  }

  else if(errorFlag)
  {
   System.out.println("Too many right parentheses");
  }

 }//Main
}//StackTester
