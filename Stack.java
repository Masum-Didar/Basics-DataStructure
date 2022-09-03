package com.solution.DSA;

public class Stack {
	
	int cap = 3;
	int myStack[] = new int[cap];
	int top = -1;
	
	void push(int x) {
		
		if(top < cap-1) {
			top = top +1;
			myStack[top] = x;
			System.out.println("Succesfully Added : "+x);
		}else
			System.out.println("Exception! Stack Overflow");
		
	}
	
	int peek() {
		if(top<0) {
			System.out.println("Exception! Stack Underflow");
			return -1;
		}
			
		return myStack[top];
	}
	
	int pop() {
		if(top<0) {
			System.out.println("Exception! Stack Underflow");
			return -1;
		}
		top = top - 1;	
		return myStack[top];
	}

	public static void main(String[] args) {
		
		Stack obj = new Stack();
		
		obj.peek();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		System.out.println("Peek is "+obj.peek());
		obj.pop();
		obj.push(40);
		System.out.println("Peek is "+obj.peek());
		obj.push(50);
		obj.push(60);

	}

}
