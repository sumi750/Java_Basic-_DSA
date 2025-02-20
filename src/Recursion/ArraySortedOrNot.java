package Recursion;
import java.util.*;
public class ArraySortedOrNot {
    public static boolean sorted(int[] arr, int index){
        if(index == arr.length-1) return true;

        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.array is sorted or not using recursion
        int[] arr = {1,5,8,6,9,15,19,20,56};
        System.out.println(sorted(arr,0));

        //2.Linear search using recursion
        System.out.println("Liner search ");
        int[] arr2 = {1,5,4,8,2,3,4,1,5,29,5};
        System.out.println(Arrays.toString(arr2));
        int n = sc.nextInt();
        int index = isFind(arr2, n, 0);
        if(index != -1){
            System.out.println("Present at index "+ index);
        }
        else{
            System.out.println("Not exist in array ");
        }

        findAllIndex(arr2,n,0);
        System.out.println(list);


    }

    static int isFind(int[] arr, int target, int index){
        if(index == arr.length) return -1;
        if(arr[index] == target){
            return index;
        }
        else{
            return  isFind(arr, target, index+1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length) return;
        if(arr[index] == target){
            list.add(index);
        }

        findAllIndex(arr, target, index+1);
    }
}
