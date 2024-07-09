package ArrayPractice;
import java.util.*;
public class MovesZeros {
    public static void moveZero(int[] arr){
        int count = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count < n){
            arr[count++] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        moveZero(arr);
        System.out.println("Array After Zero Moves ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
