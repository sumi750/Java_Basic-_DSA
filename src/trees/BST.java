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
        if(root.data > key) {
            return search(root.left, key);
        }
        if(root.data < key) {
            return search(root.right, key);
        }
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

    //Delete a Node(Important)
    public static Node delete(Node root, int val) {
        if(root == null) return root;
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

    //Print Number in Range
    public static void printInRange(Node root, int k1, int k2){
        if(root == null) {
            return;
        }
        if(root.data > k1){
             printInRange(root.left, k1, k2);
        }

        if(root.data >= k1 && root.data <= k2){
            System.out.print(root.data+" ");
        }
        //lies everything in right subtree
        if(root.data < k2){
            printInRange(root.right, k1,k2);
        }
    }

    public static void printPath(ArrayList<Integer> lists){
        for(int list: lists){
            System.out.print(list+"->");
        }
        System.out.println("null");
    }

    //Root to Leaf Paths
    public static void Print2leaf(Node root, ArrayList<Integer> list){
        if(root == null) return;
        list.add(root.data);

        if(root.left == null && root.right == null){
            printPath(list);
        }
        Print2leaf(root.left, list);
        Print2leaf(root.right, list);
        list.remove(list.size()-1);
    }

    //Valid BST (Important)
    public static boolean isVaild(Node root, Node min, Node max){
        if(root == null) return true;
        if(min != null && root.data <= min.data) return false;
        if(max != null && root.data >= max.data) return false;
        return isVaild(root.left, min, root) && isVaild(root.right, root, max);
    }
    


    public static void main(String[] args) {
        //InOrder of BST Traversal gives a sorted sequence
        Scanner sc = new Scanner(System.in);
        int[] values = {5,1,3,4,2,7,24,9,8};
//        int[] values = {1,1,1,};
        Node root = null;
        for(int i : values){
            root = insert(root,i);
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
        root = delete(root,m);
        inorder(root);
        System.out.println("enter k1 ");
        int k1 = sc.nextInt();
        System.out.println("Enter k2");
        int k2 = sc.nextInt();
        printInRange(root,k1,k2);
        System.out.println();
        System.out.println("Root to Leaf Path ");
        Print2leaf(root, new ArrayList<>());
          if(isVaild(root, null, null)){
              System.out.println("Is valid");
          }
          else{
              System.out.println("Not valid");
          }
    }
}
