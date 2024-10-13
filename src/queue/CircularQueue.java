package queue;

import java.util.*;

public class CircularQueue {
    public static class CQA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];

        public void add(int x) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is Full");
            }

            else if(size==0){
                front = rear = 0;
                arr[0] = x;
            }
            else if(rear<arr.length-1){
                arr[++rear] = x;
            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[0] = x;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty");
            }
            else{
                int val = arr[front];
                if(front == arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }
            else{
                return arr[front];
            }
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return;
            }
            else if(front<=rear){
                for(int i=front; i<=rear; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else{
                for(int i=0; i<arr.length; i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0; i<=rear; i++){
                    System.out.print(arr[i]+ " ");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) throws Exception {
            CQA q = new CQA();
            q.display();
            q.add(5);
            q.add(2);
            q.display();
            q.remove();
            q.display();
            q.add(6);
            q.add(10);
            q.add(9);
            q.display();
            System.out.println(q.peek());
    }
}
