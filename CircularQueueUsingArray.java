package Que;

public class CircularQueueUsingArray {
	
	private int[] data;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	    
	public CircularQueueUsingArray(int capacity) {
		this.capacity = capacity;
		data = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public boolean enqueue(int value) {
		if (isFull()) {
			return false;
		}
		rear = (rear + 1) % capacity;
		data[rear] = value;
		size++;
		return true;
	}

	public Integer dequeue() {
		if (isEmpty()) {
			return null;
		}
		int value = data[front];
		front = (front + 1) % capacity;
		size--;
		return value;
	}

	public static void main(String[] args) {
		CircularQueueUsingArray queue = new CircularQueueUsingArray(4);

		queue.enqueue(10);
		queue.enqueue(27);
		queue.enqueue(38);
		queue.enqueue(47);

		System.out.println(queue.dequeue());  

		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}
}
