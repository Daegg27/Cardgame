/**
 * LinkedQueue represents a linked implementation of a queue.
 */
public class LinkedQueue<T> implements QueueADT<T>
{
	private int count;
	private LinearNode<T> head, tail;

	/**
	 * Creates an empty queue.
	 */
	public LinkedQueue()
	{
		count = 0;
		head = tail = null;
	}

	/**
	 * Adds the specified element to the tail of this queue.
	 * @param element the element to be added to the tail of the queue
	 */
	public void enqueue(T element)
	{
		LinearNode<T> node = new LinearNode<T>(element);

		if (isEmpty())
			head = node;
		else
			tail.setNext(node);

		tail = node;
		count++;
	}

	/**
	 * Removes the element at the head of this queue and returns a
	 * reference to it. 
	 * @return the element at the head of this queue
	 * @throws EmptyCollectionException if the queue is empty
	 */
	public T dequeue() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("queue");

		T result = head.getElement();
		head = head.getNext();
		count--;

		if (isEmpty())
			tail = null;

		return result;
	}

	/**
	 * Returns a reference to the element at the head of this queue.
	 * The element is not removed from the queue.  
	 * @return a reference to the first element in this queue
	 * @throws EmptyCollectionsException if the queue is empty
	 */
	public T first() throws EmptyCollectionException
	{
		// To be completed as a Programming Project
		
		if (isEmpty()){
			throw new EmptyCollectionException("Queue");
		}

		return head.getElement();
	}

	/**
	 * Returns true if this queue is empty and false otherwise. 
	 * @return true if this queue is empty 
	 */
	public boolean isEmpty()
	{
		// To be completed as a Programming Project
		
		if (count == 0){
			return true;
		}
		else {
			return false;
		} // temp
	}

	/**
	 * Returns the number of elements currently in this queue.
	 * @return the number of elements in the queue
	 */
	public int size()
	{
		// To be completed as a Programming Project
		
		return count;  // temp
	}

	/**
	 * Returns a string representation of this queue. 
	 * @return the string representation of the queue
	 */
	public String toString()
	{
		// To be completed as a Programming Project
		String result = "";
		LinearNode current = head;

		while (current != null){
			result += (current.getElement().toString() + "\n");
			current = current.getNext();
		}

		return result;
		
	}
}
