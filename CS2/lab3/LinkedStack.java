public class LinkedStack<T> implements StackADT<T>
{
  private LinearNode top;  //A reference to the top of the stack
  private int count;       //The number of items on the stack

  public LinkedStack()//Constructor
  {
    count = 0;
    top = null;
  }//LinkedStack Constructor

  public T pop() throws EmptyStackException
  //Removes and returns the top item on the stack
  {
   if(isEmpty())
     throw new EmptyStackException("stack");

   T result = (T) top.getElement();
   top = top.getNext();
   count--;
   
   return result;
  }//pop

  public T peek() throws EmptyStackException
  //Returns the first item in the list
  //currently not implemented
  {
   if(isEmpty())
   {
    throw new EmptyStackException("stack");
   }
   
   T result = (T) top.getElement();
   top = top.getNext();

   return result;
  }//peek

  public void push (T element)
  //Add this data to the top of the stack
  {
    LinearNode<T> temp = new LinearNode<T>(element);
    temp.setNext(top);     //Set next field to head references
    top = temp;            //Set head to reference the new node
    count++;
  }//push

  public boolean isEmpty()
  //TASK: return true if 0 items on the stack; false otherwise
  {
    return count == 0;
  }//isEmpty


 public boolean contains(T element)
 {
  if (isEmpty()) return false;
  
  LinearNode trav = top;
  while(trav != null)
  {
   T current = (T) trav.getElement();
   if(current.equals(element))
    return true;
   trav = trav.getNext();
  }
  return false;
 }

 public int sum(T element)
 {
  LinearNode trav = top;
  int total = 0;

 if (isEmpty())
   return total;
  
  while(trav != null)
  {
   T current = (T) trav.getElement();
   total = total + current;
   trav = trav.getNext();
  }
  return total;
 } 

 public int sum()
 {
  for( int start = top; start >= 0; start--)
  {
   total = total + s[start];
   return total;
  }
 }
  
public String toString()
  //Returns the list contents as a String
  {
    LinearNode trav = top;
    String cat = "";
    while (trav != null)
    {
      cat = cat + trav.getElement().toString();
      trav = trav.getNext();
    }//while
    return cat;
  }//toString

}//LinkedStack
