package Linked_List;

public class nthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = (size - n)+1 ;  // Node from Start
        temp = head;
        for(int i=1; i<=m-1; i++){
            temp = temp.next;
        }
        return temp;
    }

    public static Node middle(Node head){
        Node temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int mid = size/2;
        for(int i=1; i<=mid; i++){
            temp = temp.next;
        }
        return temp;
    }

    public static Node middleUsingSlowAndFast(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node temp = nthNode(a, 3);
        System.out.println(temp.data);
        Node middle = middle(a);
        System.out.println(middle.data);
        Node m = middleUsingSlowAndFast(a);
        System.out.println(m.data);
    }
}
