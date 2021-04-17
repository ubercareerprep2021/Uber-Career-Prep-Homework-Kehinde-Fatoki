import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kehindefatoki
 */

static class Stack<T> {
	List<T> stack = new ArrayList();
	
	public void push(T x){
		stack.add(x);
	}
	
	public T pop(){
		int lastIndex = stack.size() - 1;
		T popValue = stack.get(lastIndex);
		stack.remove(lastIndex);
		
		return popValue;
	}
	
	public T top(){
		
		return stack.get(0);
	}
	
	public boolean isEmpty(){
		
		return stack.isEmpty();
	}
	
	public int size(){
		
		return stack.size();
	}
	
	
}

static class Queue<T>{
	List<T> queue = new ArrayList();
	
	public void enqueue(T x){
		queue.add(x);
	}
	
	public T dequeue(){
		T temp = queue.get(0);
		queue.remove(0);
		
		return temp;
	}
	
	public T rear(){
		
		
		return queue.get(queue.size() - 1);
	}
	
	public T front(){
		
		return queue.get(0);
	}
	
	public int size(){
		
		return queue.size();
	}
	
	public boolean isEmpty(){
		
		return queue.isEmpty();
	}     
	
}

public static void main(String[] args){

	Stack b = new Stack();
	b.push("wow");
	System.out.println("Top of stack: " + b.top());
	System.out.println("Size of stack: " + b.size());
	Object poppedVal = b.pop();
	System.out.println("Popped Value: " + poppedVal);
	System.out.println("Size of stack: " + b.size());


	Queue c = new Queue();
	c.enqueue(1);
	c.enqueue(2);
	c.enqueue(3);
	
	System.out.println("Size of queue: " + c.size());
	System.out.println("Front of queue: " + c.front());
	System.out.println("Rear of queue: " + c.rear());
	
	Object dequeuedItem = c.dequeue();
	System.out.println("Dequeued item: " + dequeuedItem);
}