import java.util.Stack;

class MyQueue {
    
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    
    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.push(x);
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    
    public int pop() {
        return stack1.pop();
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}



/* 
 * Use of such an implementaion of queue
 * The application for this implementation is to separate read & write of a queue
 * in multi-processing. One of the stack is for read, and another is for write. 
 * They only interfere each other when the former one is full or latter is empty.
 * 
*/