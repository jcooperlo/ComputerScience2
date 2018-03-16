public class StackTester
{
  public static void main (String [] args)
  {
    LinkedStack<Character> ls = new LinkedStack<Character>();

    //Assignes 'a', 'b', and 'c' to the stack
    ls.push (new Character ('a'));
    ls.push (new Character ('b'));
    ls.push (new Character ('c'));

    //looks at the top of the stack and returns the top
    System.out.println(ls.peek());

    //searches the stack and scans for a certain element
    if(ls.contains('a'))
    {
     System.out.println("Element found!");
    }//if
   
    //prints out the stack
    System.out.println(ls);

    //appears if the stack is empty
    if(ls.isEmpty())
    {
     System.out.println("The stack is empty.");
    }//if
    
  }//main
}//StackTester
