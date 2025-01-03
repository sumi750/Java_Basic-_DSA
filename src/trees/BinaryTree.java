package trees;
import java.util.*;
public class BinaryTree {

    public BinaryTree(){

    }
    //Node for tree
    private static class Node{
        private int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    //inert Elements (Main root)
    public void populate(Scanner sc){
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }


    //Insertion of elements in left & right in recursive manner
    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left of "+ node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of left of" + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter Right of "+ node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of left of" + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }

    }

    //Display
    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
    }
}
