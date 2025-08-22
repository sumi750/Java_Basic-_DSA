package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQ {
    public static class StackWithQ{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int val){
            q2.offer(val);

            while (!q1.isEmpty()){
                q2.offer(q1.poll());
            }

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        public boolean isEmpty(){
            return q1.isEmpty();
        }

        public int pop(){
            if(q1.isEmpty()){
                System.out.println("Stack is Empty ");
                return -1;
            }

            return q1.poll();
        }

        public int peek(){
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }

        public void display(){
            System.out.println("Elements of stack ");
            for(int val : q1){
                System.out.print(val+ " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        StackWithQ stack = new StackWithQ();
        stack.push(1);
        stack.push(2);
        stack.push(8);
        stack.push(9);

        stack.display();
        System.out.println("Top of the Stack is " + stack.peek());
    }
}
