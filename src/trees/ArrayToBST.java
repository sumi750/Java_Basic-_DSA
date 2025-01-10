package trees;
import java.util.*;
public class ArrayToBST {
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

    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //Convert BST to Balance BST
    public static Node createBSTT(ArrayList<Integer> list, int start, int end){
        if(start > end) return null;
        int mid = (start+end)/2;
        Node root = new Node(list.get(mid));
        root.left = createBSTT(list,start,mid-1);
        root.right = createBSTT(list, mid+1, end);
        return root;
    }

    public static void getInorder(Node root, ArrayList<Integer> list){
        if(root == null) return;
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }

    public static Node balanceBST(Node root){
        //Inorder Array
        ArrayList<Integer> list = new ArrayList<>();
        getInorder(root, list);

        root = createBSTT(list, 0, list.size()-1);
        return root;
    }

    public static Node createBST(int[] arr, int start, int end){

        //Base Case
        if(start > end) return null;

        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);

        root.left = createBST(arr, start,mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }


    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10,11,12};
        Node roott = createBST(arr, 0, arr.length-1);
        System.out.println("BST build successfully");
        System.out.println("PreOrder traversal ");
        preOrder(roott);
        System.out.println();
        System.out.println("InOrder traversal");
        inorder(roott);
        System.out.println();
        System.out.println("Convert BST to balanched BST");
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(15);

        root = balanceBST(root);
        inorder(root);
    }
}
