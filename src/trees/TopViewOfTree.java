package trees;
import java.util.*;
public class TopViewOfTree {
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
    static  class Info{
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }


    //Tpo View of Binary Tree
    public static void topView(Node root){
        //Level Order
        Queue<Info> q  = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min =0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()) break;
                else q.add(null);
            }

            else {
                if (!map.containsKey(curr.hd)) {   //first time occur the key
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for(int i = min; i<=max; i++){
            System.out.print(map.get(i).data + "  ");
        }
        System.out.println();
    }

    //Bottom view of Binary Tree
    public static void bottomView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;

        q.add(new Info(root, 0));

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()) break;
                else q.add(null);
            }

            map.put(curr.hd, curr.node);
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }

        for(int i = min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }

    //Left View of Tree
    public static void leftView(Node root){
        ArrayList<Node> list = new ArrayList<>();
        printLeft(root, list, 0);

        for(Node curr : list){
            System.out.print(curr.data+" ");
        }
        System.out.println();
    }

    public static void printLeft(Node root, ArrayList<Node> list, int level){
        if(root == null) return;
        if(level == list.size())  list.add(root);

        printLeft(root.left, list, level+1);
        printLeft(root.right, list, level+1);
    }

    //Right View of Binary Tree
    public static void rightView(Node root){
        ArrayList<Node> list = new ArrayList<>();
        printRight(root, list, 0);

        for(Node curr : list){
            System.out.print(curr.data+" ");
        }
    }

    public static void printRight(Node root, ArrayList<Node> list, int level){
        if(root == null) return;
        if(level == list.size()) {
            list.add(root);
        }
        else{
            list.set(level, root);
        }

        printRight(root.left, list, level+1);
        printRight(root.right, list, level+1);
    }

    //Lca of BST

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Top View of Tree ");
        topView(root);
        System.out.println("Bottom View of Tree ");
        bottomView(root);
        System.out.println("Left View of Tree");
        leftView(root);
        System.out.println("Right View of Tree ");
        rightView(root);
        System.out.println();
        System.out.println("LCA of BST ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

    }
}
