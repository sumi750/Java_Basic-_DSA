package Linked_List;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp; // Null change into ArrayPractice.temp
            }
            tail = temp;
            size++;
        }

        void insertAtStart(int data){
            Node temp = new Node(data);
            if(head==null){  //empty list
                head = tail = temp;
            }
            else{  // non-empty list
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtIndex(int index, int data){
            Node t = new Node(data); // New Node is created
            Node temp = head;
            if(index==size){
                insertAtEnd(data);
                return;
            }
            if(index==0){
                insertAtStart(data);
                return;
            }
            else if(index<0 || index>size){
                System.out.println("Wrong Index ");
                return;
            }
            for(int i=1; i<=index-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getElement(int index){
            Node temp = head;
            for(int i=1; i<=index; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAtIndex(int index){
            Node temp = head;
            for(int i=1; i<=index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
            }
            System.out.println("null");
        }

        int size(){
            return size;
        }


    }
    public static void main(String[] args) {
            linkedList ll = new linkedList();
            ll.insertAtEnd(4);
            ll.insertAtEnd(3);
            ll.insertAtEnd(2);
            ll.insertAtStart(5);
            ll.insertAtStart(6);
            ll.display();
            ll.insertAtIndex(1,9);
            ll.display();
            ll.deleteAtIndex(4);
            ll.display();
            System.out.println();
            System.out.println("Size of ll is "+ ll.size);
            System.out.println(ll.getElement(3));

    }
}
