package sort;

import java.util.LinkedList;

/**
 * 
 * @author Kritik Garg
 *
 */
public class SortedLinkList {

	LinkedList<Integer> linkedList = new LinkedList<Integer>();

	public SortedLinkList() {

	}

	/**
	 * To insert an element in linklist
	 * 
	 * @param data
	 */
	public void add(int data) {
		if (linkedList.isEmpty()) {
			linkedList.add(data);
		} else {
			addAtIndex(data, 0);
		}
	}

	/*
	 * to add an element at index, recursive call
	 */
	private void addAtIndex(int data, int index) {
		// no more elements
		if (index == linkedList.size()) {
			linkedList.add(data);
			return;
		}
		// Compare data to index element
		if (linkedList.get(index) > data) {
			linkedList.add(index, data);
			return;
		} else {
			index++;
			addAtIndex(data, index);
		}
	}

	/**
	 * getter for linklist
	 * 
	 * @return
	 */
	public LinkedList<Integer> getLinkedList() {
		return linkedList;
	}

}
