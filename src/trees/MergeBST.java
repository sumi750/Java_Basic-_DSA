package trees;
import java.util.*;
public class MergeBST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> list){
        if(root == null) return;
        getInorder(root.left,list);
        list.add(root.data);
        getInorder(root.right, list);
    }


    public static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        getInorder(root1, list1);
        getInorder(root2, list2);

        //Final Sorted ArrayList
        ArrayList<Integer> finalList = new ArrayList<>();
        int i=0;
        int j=0;

        //Merging of both Lists into final Arraylist
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i) <= list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            }
            else{
                finalList.add(list2.get(j));
                j++;
            }
        }

        while(i<list1.size()){
            finalList.add(list1.get(i));
            i++;
        }

        while(j < list1.size()){
            finalList.add(list2.get(j));
            j++;
        }

        //Sorted AL to BST
        Node root = createBST(finalList, 0, finalList.size()-1);
        return root;

    }

    public static Node createBST(ArrayList<Integer> list, int start, int end){
        if(start > end) return null;
        int mid = (start + end)/2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, start, mid-1);
        root.right = createBST(list, mid+1, end);
        return root;
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    //LCA of BST
    public static Node lcaBST(Node root, int n1, int n2){
        if(root == null) return null;

        if(root.data == n1 || root.data == n2){
            return root;
        }
        if(root.data < n1 && root.data < n2){
            return lcaBST(root.right, n1,n2);
        }

        if(root.data > n1 && root.data > n2){
            return lcaBST(root.left, n1, n2);
        }

        return root;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node tree1 = new Node(2);
        tree1.left = new Node(1);
        tree1.right = new Node(4);

        Node tree2 = new Node(9);
        tree2.left = new Node(3);
        tree2.right = new Node(12);

        Node root = mergeBST(tree1, tree2);
        inorder(root);
        System.out.println("LCA of BST ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Node ans2 = lcaBST(root,n1,n2);
        System.out.println("LCA of "+n1+" and "+n2+" is "+ ans2.data);


    }
}
