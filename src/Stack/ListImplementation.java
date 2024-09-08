package Stack;

public class ListImplementation {
    public static class Node{ //user defined data type
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LLStack{ // user defined data structure
        private  Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayRec(Node h){
            if(h == null) return;
            displayRec(h.next);
            System.out.print(h.data+ " ");
        }

        void display(){
            displayRec(head);
            System.out.println();
        }

        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println("Size of the stack " + st.size());
        st.pop();
        System.out.println("Top most element of stack " + st.peek());
        st.displayRev();
    }
}
