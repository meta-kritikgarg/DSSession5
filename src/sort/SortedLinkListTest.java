package sort;

import java.util.Scanner;
/**
 * 
 * @author Kritik Garg
 *
 */

public class SortedLinkListTest {

	public static void main(String[] args) {

		SortedLinkList sortedLinkList = new SortedLinkList();
		Scanner scan = new Scanner(System.in);
		//To add data in linklist
		char ch;
		do {
			System.out.println("Enter a number to insert");
			int data;
			while (true) {
				try {
					data = scan.nextInt();
					sortedLinkList.add(data);
					break;
				} catch (Exception e) {
					System.out.println("Not valid, Try again");
					scan.next();
				}
			}
			System.out.println("\nDo you want to continue (Type y or n)\n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		// To show sorted linkList
		System.out.println("Sorted LinkList:");
		for (int data : sortedLinkList.linkedList) {
			System.out.println(data);
		}
		scan.close();
	}

}
