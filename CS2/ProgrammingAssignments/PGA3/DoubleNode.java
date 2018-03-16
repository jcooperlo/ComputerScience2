public class DoubleNode <E>
{
	private DoubleNode <E> next;
	private E element;
	private DoubleNode <E> prev;

	public DoubleNode()
	{
		next = null;
		element = null;
	}//DoubleNode

	public DoubleNode(E elem)
	{
		next = null;
		element = elem;
	}//DoubleNode

	public DoubleNode<E> getNext()
	{
		return next;
	}//getNext

	public DoubleNode <E> getPrev()
	{
		return prev;
	}//getPrev

	public void setNext(DoubleNode <E> node)
	{
		next = node;
	}//setNext
	
	public E getElement()
	{
		return element;
	}//getElement

	public void setElement(E elem)
	{
		element = elem;
	}//setElement

	public void setPrev(DoubleNode <E> node)
	{
		prev = node;
	}//setPrev
}//DoubleNode
	
