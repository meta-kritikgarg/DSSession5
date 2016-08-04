package queue;

import java.util.LinkedList;

/**
 * 
 * @author Kritik Garg
 *
 * @param <E>
 */
public class MyQueue<E> {

	LinkedList<E> linkedList = new LinkedList<E>();

	/**
	 * Constructor
	 */
	public MyQueue() {
	}

	/**
	 * To add data in queue
	 * 
	 * @param data
	 */
	public void enqueue(E data) {
		linkedList.addLast(data);
	}

	/**
	 * To remove data front from queue
	 * 
	 * @return data
	 */
	public E deQueue() {
		return linkedList.remove();
	}

	/**
	 * To get data from front
	 * 
	 * @return data
	 */
	public E getFront() {
		return linkedList.getFirst();
	}

	/**
	 * To remove all the elements from queue
	 */
	public void removeAll() {
		linkedList.clear();
	}

	/**
	 * To get size of queue
	 * 
	 * @return
	 */
	public int getSize() {
		return linkedList.size();
	}

	/**
	 * To check if list is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

}
