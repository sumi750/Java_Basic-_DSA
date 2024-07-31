package Linked_List;
import java.util.*;
public class Basic1 {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }

    public  static void PrintL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void display(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }

    public static void displayR(Node head){
        //Main Point is Call Stack
        if(head == null) return;
        displayR(head.next);
        System.out.print(head.data+ " ");
    }

    public static int length(Node a){
        int count = 0;
        while(a != null){
            count++;
            a = a.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println("Print Using Recursion");
        display(a);
        System.out.println();
        int len = length(a);
        System.out.println("Length of Node is "+ len);
    }

}
