package ArrayPractice;
import java.util.*;
public class MergeSortA {
    public static void merge(int arr1[], int arr2[], int m , int n){
        int p1 = m-1, p2 = n-1, i=m+n-1;
        while(p2 >= 0){
            if(p1 >= 0 && arr1[p1] > arr2[p2]){
                arr1[i--] = arr1[p1--];
            }
            else{
                arr1[i--] = arr2[p2--];
            }
        }

        for(int j = 0; j<m+n; j++){
            System.out.print(arr1[j]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int m = 3;
        int n = 3;
        merge(arr1, arr2, m, n);
    }
}
