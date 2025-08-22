package Stack;

public class QueueUsingLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public static class QueueLL{
        Node front;
        Node rear;

        public QueueLL(Node front, Node rear){
            front = rear = null;
        }

        public void push(int val){
            Node newNode = new Node(val);

            if(rear == null){
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public int pop(){
            if(front == null){
                System.out.println("Q is Empty ");
                return -1;
            }
            int val = front.data;
            front = front.next;
            return val;
        }

        public int peek(){
            if(front == null){
                System.out.println("Q is Empty ");
                return -1;
            }
            return front.data;
        }

        public boolean isEmpty(){
            return front == null;
        }

        public void display(){
            if(front == null){
                System.out.println("Q is Empty ");
                return;
            }

            Node temp = front;
            System.out.print("Queue ");
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        QueueLL q = new QueueLL(null, null);
        q.push(1);
        q.push(5);
        q.push(8);
        q.push(9);

        q.display();

        q.pop();

        q.display();

        System.out.println("Top of the Queue is " + q.peek());
        System.out.println(q.isEmpty());

    }
}
