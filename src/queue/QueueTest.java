package queue;

import java.util.Scanner;

/**
 * 
 * @author Kritik Garg
 *
 */
public class QueueTest {

	public static void main(String[] args) {

		MyQueue<Integer> queue = new MyQueue<Integer>();
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			System.out.println("\nQueue Operations");
			System.out.println("1. insert");
			System.out.println("2. remove front");
			System.out.println("3. check empty");
			System.out.println("4. get front");
			System.out.println("5. clear");
			System.out.println("6. size");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter a number to insert");
				int data;
				while (true) {
					try {
						data = scan.nextInt();
						break;
					} catch (Exception e) {
						System.out.println("Try again");
						scan.next();
					}
				}
				queue.enqueue(data);
				break;
			case 2:
				System.out.println("Element removed \n" + queue.deQueue());
				break;
			case 3:
				System.out.println("Empty Status : " + queue.isEmpty());
				break;
			case 4:
				System.out.println("Front element : " + queue.getFront());
				break;
			case 5:
				queue.removeAll();
				System.out.println("Priority Queue Cleared");
				break;
			case 6:
				System.out.println("\nSize = " + queue.getSize());
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		// To show complete queue
		System.out.println("Queue:");
		for (int data : queue.linkedList) {
			System.out.println(data);
		}

		scan.close();
	}

}
