package trees;
import javax.sound.midi.Soundbank;
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
        public static Node buildTree(int[] nodes){
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

         //Level order (M-2)
         public static List<List<Integer>> level(Node root){
            List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
            Queue<Node> q = new LinkedList<Node>();

            q.offer(root);
            while(!q.isEmpty()){
                int levelNum = q.size();
                List<Integer> sublist = new LinkedList<Integer>();
                for(int i=0; i<levelNum; i++){
                    if(q.peek().left != null) q.offer(q.peek().left);
                    if(q.peek().right != null) q.offer(q.peek().right);

                    sublist.add(q.poll().data);
                }

                wrapList.add(sublist);
            }

            return wrapList;
         }

         //Count of Total Nodes in Tree
         public static int countNode(Node root){
            if(root == null) return 0;
            return countNode(root.left) + countNode(root.right) + 1;
         }

         //Sum of Total Nodes values
         public static int sum(Node root){
            if(root == null) return 0;
            return sum(root.left) + sum(root.right) + root.data;
         }


         //Diameter of Tree
         public static int diameter(Node root){


            if(root == null){
                return  0;
            }

            int leftDiam = diameter(root.left);
            int leftH = heightT(root.left);
            int rightDiam = diameter(root.right);
            int rightH = heightT(root.right);

            int selfDiam = leftH + rightH +1;

            return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
         }


         //Top view of tree
         public static List<Integer> topView(Node root) {
            class Info{
                 Node node;
                 int hd;

                 public Info(Node node, int hd){
                     this.node = node;
                     this.hd = hd;
                 }
             }

             Queue<Info> q = new LinkedList<>();
             TreeMap<Integer, Integer> map = new TreeMap<>(); // Maintains sorted order

             List<Integer> result = new ArrayList<>();

             if(root == null) return result;

             int max = 0, min=0;

             q.add(new Info(root, 0));

             while(!q.isEmpty()){
                 Info curr = q.poll();
                 Node node = curr.node;
                 int hd = curr.hd;

                 if(!map.containsKey(hd)){
                     map.put(hd, node.data);
                 }

                 if(node.left != null) {
                     q.add(new Info(node.left , hd-1));
                     min = Math.min(min, hd-1);
                 }

                 if(node.right != null){
                     q.add(new Info(node.right, hd+1));
                     max = Math.max(max, hd+1);
                 }
             }

             for(int i = min; i<=max; i++){
                 result.add(map.get(i));
             }

             return result;

         }

         //Root to node path
         public static ArrayList<ArrayList<Integer>> allPath(Node root){
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            ArrayList<Integer> currentPath = new ArrayList<>();
            dfs(ans, currentPath, root);
            return ans;
         }

         public static void dfs(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> current, Node root){
            if(root == null) return;
            current.add(root.data);

            if(root.left == null && root.right == null){
                ans.add(new ArrayList<>(current));
            }
            else{
                dfs(ans, current, root.left);
                dfs(ans, current, root.right);
            }

            current.remove(current.size()-1);
         }

         //Boundary traversal
         public static ArrayList<Integer> boundary(Node root){
            ArrayList<Integer> ans = new ArrayList<>();
            if(root == null) return ans;
            if(!isLeaf(root)) ans.add(root.data);

            //Left excluding leaves
              leftBound(root.left, ans);

             //leaves (normal inorder)
             leaves(root, ans);

             //right nodes in reverse order
             rightBound(root.right, ans);

             return ans;
         }

         private static boolean isLeaf(Node root){
            return root.left == null && root.right == null;
         }

         private static void leftBound(Node root, ArrayList<Integer> ans){
            while(root != null){
                if(!isLeaf(root))  ans.add(root.data);
                root = (root.left != null) ? root.left : root.right;
            }
         }

         private static void leaves(Node root, ArrayList<Integer> ans){
            if(root == null) return;
            if(isLeaf(root)) {
                ans.add(root.data);
                return;
            }

            leaves(root.left, ans);
            leaves(root.right, ans);
         }

         private static void rightBound(Node root, ArrayList<Integer> ans){
            Stack<Integer> stack = new Stack<>();
            while (root != null){
                if(!isLeaf(root)) stack.push(root.data);
                root = (root.right != null) ? root.right : root.left;
            }

            while (!stack.isEmpty()) ans.add(stack.pop());
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

        System.out.println(tree.level(root));

        System.out.println("Count of Nodes in Tree Is "+ tree.countNode(root));
        System.out.println("Sum of All Nodes of tree " + tree.sum(root));
        System.out.println("Diameter of tree " + tree.diameter(root));

        System.out.println("Top view of tree ");
        System.out.println(tree.topView(root));

        System.out.println(tree.allPath(root));

        System.out.println(tree.boundary(root));
    }
}
