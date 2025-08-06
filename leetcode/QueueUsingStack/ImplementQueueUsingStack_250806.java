package leetcode.QueueUsingStack;

import java.util.Stack;

public class ImplementQueueUsingStack_250806 {
    public static void main(String[] args) {
        /*MyQueue myQueue = new MyQueue();
        System.out.println(myQueue.empty());
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());*/

        class MyQueue {
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

    }
}


