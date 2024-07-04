package ArrayPractice;
import java.util.*;
public class que {
    public static boolean sortedOrNot(int  arr[]){
        int n = arr.length;
        if(n==1 || n==0){
            return true;
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
        }

        boolean m = sortedOrNot(arr);
        if(m){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is Not Sorted");
        }
    }
}
