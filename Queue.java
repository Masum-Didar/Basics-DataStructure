package com.solution.DSA;

public class Queue {
	int cap = 3;
	int front = -1;
	int rear = -1;
	int tItem = 0;
	int myQueue[] = new int[cap];
	
	 
	void enqueue(int x) {
		if(tItem==cap) {
			System.out.println("Exception! Queue overflow");
			return;
		}
		rear = (rear + 1) % cap;
		myQueue[rear] = x;
		System.out.println("Succesfully Added " +x);
		tItem++;
	}
	
	/*
	 * int peek() { if(tItem==0) { System.out.println("Exception! Queue underflow");
	 * return -1; }
	 * 
	 * return myQueue[front]; }
	 */
	
	int dequeue() {
		if(tItem==0) {
			System.out.println("Exception! Queue underflow");
			return -1;
		}
		
		front = (front + 1) % cap;
		System.out.println("Succesfully remove "+front);
		tItem--;
		return myQueue[front];
	}
	void Diplay() {
		System.out.print("Queue List is: ");
		for(int i = 0; i<cap; i++) {
			System.out.print(myQueue[i] +" ");
		}
	}
	
	public static void main(String[] args) {
		
		Queue obj = new Queue();
		obj.dequeue();
		obj.enqueue(10);
		obj.enqueue(20); 
		obj.enqueue(30);
		obj.Diplay();
	
		obj.dequeue();
		obj.enqueue(40);
		obj.Diplay();
		
		obj.dequeue();
		obj.enqueue(50);
		obj.Diplay();
	

	}

}
