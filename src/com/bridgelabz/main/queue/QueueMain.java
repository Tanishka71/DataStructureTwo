package com.bridgelabz.main.queue;

// main class
public class QueueMain {
	public static void main(String [] args) {
		Queueq queue=new Queueq();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

}
	
}
