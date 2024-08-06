package Que;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueUsingArrayDeque {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();

		queue.offer(15);
		queue.offer(28);
		queue.offer(35);

		System.out.println(queue.poll());
		System.out.println(queue.peek());

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
