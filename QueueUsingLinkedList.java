package Que;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(10);
		queue.offer(27);
		queue.offer(39);

		System.out.println(queue.poll());  
		System.out.println(queue.peek()); 

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}