package ArrayPractice;
import java.util.*;
public class RemoveElement {

    public static int remove(int arr[], int val){
        int count =0;
        int v = val;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=v){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }

    public static boolean ThreeOdds(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                count++;
            }
            else{
                count = 0;
            }
            if(count >= 3){
                return true;
            }
        }
        return false;
    }

    public static int removeDuplicate(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arr[count] = arr[i];
                count++;
            }
        }
        arr[count] = arr[arr.length-1];
        count++;
        return count;
    }

    public static int remove(int arr[]){
        int count = 0;
        for(int n:arr){
            if(count < 2 || n!=arr[count-2]){
                arr[count++] = n;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int val = 3;
        System.out.println(remove(arr, val));
        System.out.println(ThreeOdds(arr));
        System.out.println(removeDuplicate(arr));
        System.out.println(remove(arr));
    }

}
