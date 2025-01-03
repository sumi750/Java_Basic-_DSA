package trees;
import java.util.*;
public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        //Getter for get a value of Node
        public int getValue(){
            return value;
        }
    }

    private Node root;

    public BST(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    //Inserting in tree
    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null) {
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }

        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null) return true;

        return Math.abs(height(node.left)-height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    private void display(Node node, String details){
        if(node == null) return;
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "right child of " + node.getValue() + " : ");
    }

    public static void main(String[] args) {
    
    }
}
