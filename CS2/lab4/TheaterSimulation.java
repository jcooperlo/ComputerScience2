import java.io.*; 
import java.util.*; 
import java.math.*; 
 

public class TheaterSimulation { 
 

public static void main (String[] args) throws IOException 
{ 
 

/* This main method simulates a theater queue 
* See "Data Abstraction and Structures" by Headington 
* and Riley (Heath publisher) for more information 
*/ 
 

// Create a queue object named TQ (for Theater Queue)
LinkedQueue<Character> TQ = new LinkedQueue<Character>(); 
int timeUnit; // for loop control variable 
int turnedAway = 0; // the number of people who leave w/o ticket 
int numA = 0; // tickets bought to movie A 
int numB = 0; // tickets bought to movie B 
char movieChoice; //A or B



for (timeUnit = 1; timeUnit <= 180; timeUnit++) //loop 180 times 
{  
// if there is someone at the front of the line, sell ticket 
// to them and get them out of the line 
if (!TQ.isEmpty() ) 
{ 
  if (TQ.front().equals(new Character('A'))) //A ticket to movie A 
    numA++; //so add 1 to count for movie A customers 
  else //The only other movie is B 
    numB++; 
  TQ.dequeue(); //in either case, this is where they leave the line 
}//ENDif 

if ( Math.random() <= 0.7) 
{ //generate a Random no 0<=rn<=1
  if (TQ.size() > 50) // A line of 50 is too long to wait 
    turnedAway++; // so leave 
  else // otherwise randomly choose a movie 
  { 
    movieChoice = (char) (65 + (int) (Math.random() * 2.0));
    if(!TQ.isFull()) 
      TQ.enqueue(new Character(movieChoice)); 

 
  }//else 
}//if


}//for 
 
 int size = 0;
 size = size + TQ.size();
 int average = size/180;
 
 double aCost = 0;
 double bCost = 0;
 double total = 0;

 aCost = numA*5;
 bCost = numB*7.5;
 total = aCost + bCost;


//print the results of the simulation 
System.out.println("Movie A customers: "+numA); 
System.out.println("Movie B customers: "+numB); 
System.out.println("Number turned away: "+turnedAway); 
System.out.println("Average line length: "+average); 
System.out.println("Receipts for movie A: "+aCost);
System.out.println("Receipts for movie B: "+bCost);
System.out.println("Total receipts: "+total);
}//main 
 

}//class
