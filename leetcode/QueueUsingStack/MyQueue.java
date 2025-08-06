package leetcode.QueueUsingStack;

import java.util.Stack;
// 큐는 FIFO
public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        // 1 2 3
        while(!stack1.empty()) {
            stack2.push(stack1.pop()); // 3 2 1
        }
        int n = stack2.pop(); // 1
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return n;
    }

    public int peek() {
        // 1 2 3
        while(!stack1.empty()) {
            stack2.push(stack1.pop()); // 3 2 1
        }
        int n = stack2.pop(); // 1
        stack1.push(n);
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return n;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
