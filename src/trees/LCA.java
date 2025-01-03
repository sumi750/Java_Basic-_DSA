package trees;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
public class LCA {
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

    public static int height(Node root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    //Approach 1 for LCA
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }

        boolean fountLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundRight || fountLeft) return true;

        path.remove(path.size()-1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2){  //O(n) T.C
          ArrayList<Node> path1 = new ArrayList<>();
          ArrayList<Node> path2 = new ArrayList<>();

          getPath(root, n1, path1);
          getPath(root, n2, path2);

          int i = 0;
          for(; i<path1.size() && i<path2.size(); i++){
              if(path1.get(i) != path2.get(i)){
                  break;
              }
          }

          return path1.get(i-1);
    }

    //Approach 2 for LCA
    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }
        return root;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Height of Tree is " + height(root));
        int n1 = 5, n2 = 7;
        Node ans = lca(root, n1, n2);
        System.out.println("LCS of 5 as 7 is " + ans.data);
        Node ans2 = lca2(root,n1,n2);
        if(ans2 == null){
            System.out.println("No common ancestor is found");
        }
        else{
            System.out.println("LCA of 5 and 7 is " + ans2.data);
        }
    }
}
