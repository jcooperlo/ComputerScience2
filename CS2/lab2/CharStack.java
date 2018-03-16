public class CharStack
{
 private final int MAX_CAP = 100;
 private int top; //location of top item on the stack
 private char [] s; //The Stack

 public CharStack()
 //PRE: 
 //POS:
 //TAS: Create an empty stack with a default capacity
 {
  s = new char[MAX_CAP];
  top = -1;
 }//CharStack
 
 public void push(char element)
 //PRE: 
 //POS:
 //TAS: Add a new item to the stack
 {
  top ++;
  s[top] = element;
 }//push

 public char pop()
 //PRE: top > -1
 //POS: top<exit> == top<entry>-1
 //TAS: remove and return the item on the top of the stack
 {

  char ret = s[top];
  top--;
  return ret;

 }//pop

 public boolean isEmpty()
 //PRE: None
 //POS:
 //TAS: Return whether or not the stack is empty. HINT: look at the constructor
 {

  return top == -1;
 }//isEmpty

 public boolean isFull()
 //PRE: None
 //POS:
 //TAS: return whether or not the stack if full
 {
  return top == MAX_CAP-1;
 }//isFull

}//CharStack
