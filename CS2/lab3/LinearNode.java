public class LinearNode<T>
{
  private LinearNode next;
  private T element;

  public LinearNode() //Default constructor
  {
    next = null;
    element = null;
  }//constructor LinearNode

  public LinearNode(T elem) //Parameterized constructor
  {
    next = null;
    element = elem;
  }//constructor LinearNode (T elem)

  public LinearNode getNext()
  {
    return next;
  }//getNext

  public void setNext(LinearNode node)
  //TASK: sets next to reference the next node in the list
  {
    next = node;
  }//setNext

  public T getElement()
  //TASK: return the element stored in this node
  {
    return element;
  }//getElement

  public void setElement(T elem)
  //TASK: Set the element in this node to param elem
  {
    element = elem;
  }//setElement

}//LinearNode
