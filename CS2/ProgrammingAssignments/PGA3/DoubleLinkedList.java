import java.util.*;

public class DoubleLinkedList <T>// implements ListADT<T>, Iterable<T>
{
	protected int count;
	protected DoubleNode<T> head, tail;

	public DoubleLinkedList()
	{
		count = 0;
		head = tail = null;
	}//DoubleLinkedList

	public void addHead(T element)
	{
		DoubleNode <T> node = new DoubleNode <T>(element);
		if(isEmpty())
		{
			tail = node;
		}

		else
		{
			node.setNext(head);
			node.setPrev(node);
		}

		head = node;
		count++;
	}
	
	public void addTail(T element)
	{
		DoubleNode<T> node = new DoubleNode<T> (element);
		if(isEmpty())
		{
			head = node;
		}

		else
		{
			tail.setNext(node);
			node.setPrev(tail);
		}
		
		tail = node;
		count++;
	}

	public T removeFirst() throws EmptyCollectionException
	{
		if(isEmpty())
		{
			throw new EmptyCollectionException("List");
		}

		DoubleNode<T> result = head;
		head = head.getNext();
		
		if(head == null)
		{
			tail = null;
		}
		else
		{
			head.setPrev(null);
		}

		count--;
		return result.getElement();
	}

	public T removeLast() throws EmptyCollectionException
	{
		if(isEmpty())
		{
			throw new EmptyCollectionException("List");
		}
		
		DoubleNode<T> result = tail;
		tail = tail.getPrev();
		
		if(tail == null)
		{
			head = null;
		}
		else
		{
			tail.setNext(null);
		}
		
		count--;
		return result.getElement();
	}	

	public T remove(T targetElement)// throws EmptyCollectionException
	{
		if(isEmpty())
		{
			throw new EmptyCollectionException("List");
		}
		
		boolean found = false;
		DoubleNode<T> previous = null;
		DoubleNode<T> current = head;
		
		while(current != null && !found)
		{
			if(targetElement.equals(current.getElement()))
			{
				found = true;
			}

			else
			{
				previous = current;
				current = current.getNext();
			}

		}
		
		if(!found)
		{
			throw new ElementNotFoundException("List");
		}

		if(size() == 1)
		{
			head = current.getNext();
			head = tail = null;
		}

		else if(current.equals(head))
		{
			head = current.getNext();
			head.setPrev(null);
		}
		
		else if(current.equals(tail))
		{
			tail = previous;
			tail.setNext(null);
		}
		
		else
		{
			previous.setNext(current.getNext());
			current.getNext().setPrev(previous);
		}
		
		count--;
		return current.getElement();
	}//remove

	public void addBefore(DoubleNode current, T elem)
	{
		DoubleNode insertNode = new DoubleNode(elem);
		
		current.getPrev().setNext(insertNode);
		insertNode.setPrev(current.getPrev());
		current.setPrev(insertNode);	
		insertNode.setNext(current);

		count++;
	}

	public void addAlpha(T elem)
	{
		if(isEmpty())
		{
			addHead(elem);
		}
		else
		{
			DoubleNode current = head;
			boolean insertLocationFound = false;
		
			while((current != null) && (!insertLocationFound))
			{
				if(((Comparable)current.getElement()).compareTo(elem) > 0)
				{
					insertLocationFound = true;
				}//if
				else
				{
					current = current.getNext();
				}//else
			}//while

			if(current == null)
			{
				addTail(elem);
			}//if
			else if(current == head)
			{
				addHead(elem);
			}//elseIf
			else
			{
				addBefore(current, elem);
			}//else
		}//else
	}//addAlpha

	public boolean isEmpty()
	{
		return(count == 0);
	}
	
	public int size()
	{
		return count;
	}

	public Iterator<T> iterator()
	{
		return new LinkedIterator<T>(head, count);
	}
	
	public String toString()
	{
		DoubleNode<T> current = head;
		String result = "";
		
		while(current != null)
		{
			result = result + (current.getElement() + "\n").toString();
			current = current.getNext();
		}

		return result;
	}

	public String rToString()
	{
		DoubleNode<T> current = tail;
		String result = "";

		while(current != null)
		{
			result = result + (current.getElement() + "\n").toString();
			current = current.getPrev();
		}
		
		return result;
	}
}
