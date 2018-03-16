import java.util.*;
public class ListDriver
{
  public static void main (String [] args)
  {
       System.out.println("Creating a new list with xyz in it.");
	//1. Test the constructor, addTail and addHead methods
	//   ...should create a list containing head-> x <-> y <-> z <-tail.
       LinkedList list = new LinkedList();
       list.addTail(new Character ('y'));
       list.addTail(new Character ('z'));
       list.addHead(new Character ('x'));
	
	//2. Test the iterator...should display x y z
       Iterator it = list.iterator();
       while (it.hasNext())
         System.out.print(it.next()+" ");
       System.out.println();

	//3. Test the addAfter method...should alter list to x A y B z C
	list.addAfter (new Character('x'), new Character('A'));
	list.addAfter (new Character('y'), new Character('B'));
	list.addAfter (new Character('z'), new Character('C'));
	
	//4. Test the toString method
	System.out.println(list);

	//5. Test the remove method...should alter list to y B z
	list.remove(new Character('A')); //Remove a node in the middle
	list.remove(new Character ('x')); //Remove the head
	list.remove(new Character ('C')); //Remove the tail
	System.out.println(list);
	
	//6. Test the other remove methods...should alter the list to B
	list.removeFirst();
	list.removeLast();
	System.out.println(list);

  }//main
}
/*





import java.util.*; //for iterator
public class ListDriver
{
	public static void main (String [] args)
	{
		LinkedList<Character> list = new LinkedList<Character>();
		
		list.addHead(new Character('A'));
		list.addHead(new Character('B'));
		list.addHead(new Character('C'));
		list.addTail(new Character('W'));
		list.addHead(new Character('Y'));
		System.out.println(list.toString());

		list.removeFirst();
		System.out.println(list.toString());

		list.removeLast();
		System.out.println(list.toString());

		list.remove('A');
		System.out.println(list.toString());

		list.addAfter('C', 'G');
		System.out.println(list.toString());
				

		System.out.println("Front of list: "+list.first());
		System.out.println("End of list: "+list.last());
		Character testChar = new Character('D');
		System.out.println("Contains 'D'?"+list.contains(testChar));

		System.out.println("Here is the iterator: ");
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}//main
}//ListDriver
*/
