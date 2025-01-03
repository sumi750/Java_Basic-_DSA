package trees;
import java.util.*;
public class BinaryTree2 {

    //Node class
     static class Node{
        int data;
        Node left;
        Node right;

         Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     static class BinaryTre{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1) {
                return null; }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Pre Order Traversal
         public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
         }

         //InOrder Traversal
         public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
         }

         //Post Order
         public static void postOrder(Node root){
             if(root == null){
                 return;
             }
             postOrder(root.left);
             postOrder(root.right);
             System.out.print(root.data + " ");
         }

         //Level Order Traversal
         public static void LevelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()) break;
                    else q.add(null);
                }
                else{
                    System.out.print(currNode.data+ " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
         }

         //Height of Tree
         public static int heightT(Node root){
            if(root == null) return 0;
            int leftH = heightT(root.left);
            int rightH = heightT(root.right);
            return Math.max(leftH, rightH) + 1;
         }

         //Largest in each row
         public static void largestValue(Node root){
             if(root == null){
                 return;
             }
             Queue<Node> q = new LinkedList<>();
             q.add(root);
             while(!q.isEmpty()){
                 int size = q.size();
                 int max = Integer.MIN_VALUE;
                 for(int i = 0; i<size; i++){
                     Node curr = q.remove();
                     if(curr.left != null) q.add(curr.left);
                     if(curr.right != null) q.add(curr.right);
                     max = Math.max(max, curr.data);
                 }
                 System.out.println(max);
             }
         }

    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTre tree = new BinaryTre();
        Node root = tree.buildTree(nodes);
        System.out.println("Pre Order Traversal");
        tree.preOrder(root);
        System.out.println();
        System.out.println("in order");
        tree.inorder(root);
        System.out.println();
        System.out.println("Post Order Traversal");
        tree.postOrder(root);
        System.out.println();
        System.out.println("Level Order Traversal");
        tree.LevelOrder(root);
        System.out.println("Height of Tree " + tree.heightT(root));
        System.out.println("Largest value in each row of tree");
        tree.largestValue(root);

    }
}
