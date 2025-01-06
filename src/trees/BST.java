package trees;
import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Inserting in Binary Tree
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        } else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    //Inorder Traversal
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Searching in BST
    public static boolean search(Node root, int key){
        if(root == null) {
            return false;
        }
        if(root.data == key) return true;
        if(root.data > key) return search(root.left, key);
        if(root.data < key) return search(root.right, key);
        return false;
    }

    // Min in BST
    public static Node min(Node root){
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

    //Max in Tree
    public static Node max(Node root){
        Node temp = root;
        while(temp.right != null){
            temp = temp.right;
        }
        return temp;
    }

    //Delete a Node
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            //case : 1 (No child)
            if (root.left == null && root.right == null) {
                return null;
            }

            //case : 2 (One child)
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            //Case : 3 (Both Children) --> find Inorder Successor
            Node IS = inorderSFind(root.right);
            root.data = IS.data;
            delete(root.right, IS.data);
        }
        return root;
    }

    //Inorder Successor
    public static Node inorderSFind(Node root){
        //No need of Null Case
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    


    public static void main(String[] args) {
        //InOrder of BST Traversal gives a sorted sequence
        Scanner sc = new Scanner(System.in);
        int values[] = {5,1,3,4,2,7,24,9,8};
        Node root = null;
        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println("Searching in Tree ");
        System.out.println("Enter element u want to search ");
        int n = sc.nextInt();
        boolean element = search(root, n);
        if(element) System.out.println(n + "Element is present in tree ");
        else System.out.println(n + " not present in tree");

        System.out.println("MIn in Tree " +  min(root).data);
        System.out.println("Max  in Tree " +  max(root).data);
        System.out.println("Deletion in BST tree enter a element ");
        int m = sc.nextInt();
        root = delete(root,n);
        inorder(root);
    }
}
