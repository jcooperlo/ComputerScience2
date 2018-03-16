//Author: Cooper Locke

public class Stack
{
 //declares MAX_CAP, top, and 's'
 private final int MAX_CAP = 100;
 private int top;
 private char [] s;
 
 //places start of stack at -1
 public Stack()
 {
  s = new char[MAX_CAP];
  top = -1;
 }//CharStack

 //places element onto the stack
 public void push(char element)
 {
  top++;
  s[top] = element;
 }//push
 
 //removes element from stack
 public char pop()
 {
  char ret = s[top];
  top--;
  return ret;
 }//pop

 //check to see if stack is empty
 public boolean isEmpty()
 {
   return top == -1;
 }//isEmpty

 //checks to see if the stack is full
 public boolean isFull()
 {
  return top == MAX_CAP-1;
 }//isFull
}//Stack

