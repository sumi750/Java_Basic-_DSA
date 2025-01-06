package trees;

import java.util.Scanner;

public class BSTT{
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

        //Tree
        static class BST {
            Node root;

            BST() {
                root = null;
            }  //constructor calling


            //Building and Insertion in BST
            void insert(int val) {
                root = insertIntoTree(root, val);
            }

            Node insertIntoTree(Node root, int data) {
                if (root == null) {
                    root = new Node(data);
                    return root;
                }

                if (data < root.data) {
                    root.left = insertIntoTree(root.left, data);
                } else if (data > root.data) {
                    root.right = insertIntoTree(root.right, data);
                }
                return root;
            }

            void InOrder() {
                inorder(root);
            }

            void inorder(Node root) {
                if (root == null) return;
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }

            //Searching In BST (Iterative way , for space constant)
            boolean search(int n) {
                return search(root, n);
            }

            boolean search(Node root, int key) {
                Node temp = root;
                if(temp == null) return false;
                while (temp != null) {
                    if (temp.data == key) return true;
                    if (temp.data > key) temp = temp.left;
                    if (temp.data < key) temp = temp.right;

                }
                return false;
            }

            public  Node delete(int val){
                root = delete(root,val );
                return root;
            }

            //Deletion of Node in BST tree
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
        }


        public static void main(String[] args) {
            BST tree = new BST();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to insert in BST, Type 'done' to finish ");
            while(sc.hasNext()){
                if(sc.hasNextInt()){
                    int value = sc.nextInt();
                    tree.insert(value);
                }

                else{
                    String input = sc.next();
                    if(input.equalsIgnoreCase("done")){
                        break;
                    }
                    else{
                        System.out.println("Invalid point, please enter value or done");
                    }
                }
            }
            System.out.println("Inorder traversal");
            tree.InOrder();

            //Inserting a Random element in a BST
            System.out.println("Enter value to insert in BST ");
            int n = sc.nextInt();
            tree.insert(n);

            System.out.println("Inorder traversal");
            tree.InOrder();
            System.out.println("Enter element u want to search ");
            int el = sc.nextInt();
            boolean x = tree.search(el);
            if(x) System.out.println("Element is present in tree");
            else System.out.println("Element is not present");

            System.out.println("Delete a Node in BST enter a value you want to delete from TREE");
            int m = sc.nextInt();
            tree.delete(m);
            tree.InOrder();
        }
}
