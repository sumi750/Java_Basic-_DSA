package Binary_Search_Q;
import java.util.*;
public class FindElement_In_Infinite_Array {

    //Divide Array into chunks and find the index
    public static int findIndex(int[] arr , int target){
        //Find the range
        //first start with size of box two and try to search for it
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;

            //Double the box value -> end = prev end + sizeofBox*2;
            end = end + (end - start + 1) * 2;
            start = newStart;

        }

        return binarySearch(arr, target, start, end);

    }

    public static int binarySearch(int[] arr, int target, int s, int e){
        while (s<= e){
            int mid = s + (e-s) /2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                s = mid +1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //We don't have to find answer using length because of Infinite Array
        Scanner sc = new Scanner(System.in);

        //Let consider arr in infinite Array
        int[] arr = {2,3,4,5,6,9,10,15,18,20,24,29,35,40,41,45,60,65,66,67,69,70,71,75,78,
        80,81,85,86,87,89,90,100,105,110};
        int target = sc.nextInt();
        System.out.println("Index of Target "+ findIndex(arr, target));

    }
}
