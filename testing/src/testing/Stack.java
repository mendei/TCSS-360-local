package testing;
import java.util.LinkedList;


import java.util.Queue;
//import java.util.Stack;

public class Stack

{

	Queue<Integer> queue = new LinkedList<Integer>();

	void push(int value){

		int size = queue.size();

		queue.add(value);

		for (int i = 0; i < size; i++) {

			int a = queue.remove();

			queue.add(a);

		}

	}

	int pop(){

		if (queue.isEmpty()){

			System.out.println("No elements");

			return -1;

		}

		int a = queue.remove();

		return a;

	}

	int top()	{

		if (queue.isEmpty())

			return -1;

		return queue.peek();

	}

	boolean isEmpty(){

		return queue.isEmpty();

	}

	public static void main(String[] args){

		Stack stack = new Stack();

		stack.push(100);

		stack.push(200);

		System.out.println(stack.top());

		stack.pop();

		System.out.println(stack.top());

		stack.push(300);

		System.out.println(stack.top());

		stack.pop();

		System.out.println(stack.top());

	}

}