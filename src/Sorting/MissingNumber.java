package Sorting;

public class MissingNumber {
    public static int sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if( arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr , i, correct);
            }
            else{
                i++;
            }
        }

        for(int j=0; j<=arr.length; j++){
            if(j != arr[j]){
                return j;
            }
        }
        return arr.length;
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        int miss = sort(arr);
        System.out.println(miss);
    }
}
