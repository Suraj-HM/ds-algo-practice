import java.util.Queue;
import java.util.LinkedList;


class MyStack {
    
    Queue<Integer> stack;
    int size;
    
    public MyStack() {
        stack = new LinkedList<Integer>();
        size = 0;
    }
    
    public void push(int x) {
        stack.add(x);
        size++;
    }
    
    public int pop() {
        int temp = size;
        if(temp > 0) {
            temp--;
            while(temp != 0) {
                stack.add(stack.poll());
                temp--;
            }
            size--;
            return stack.poll();
        }
        return 0;
    }
    
    public int top() {
        int temp = size;
        int top = 0;
        if(temp > 0) {
            while(temp != 0) {
                top = stack.poll();
                stack.add(top);
                temp--;
            }
            return top;
        }
        return 0;
    }
    
    public boolean empty() {
        return size == 0;
    }
}