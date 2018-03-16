public class EmptyStackException extends RuntimeException
{

   public EmptyStackException()
   {
      super ("The Stack is empty.");
   }

   public EmptyStackException (String message)
   {
      super (message);
   }
}//EmptyStackException
