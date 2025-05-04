package Binary_Search_Q;

public class Minimum_in_Sorted {
    public static int minimum(int[] arr){
        int low = 0;
        int high = arr.length-1;

        //array is not rotated
        if(arr[low] <= arr[high]) return arr[low];

        while(low < high){
            int mid = low + (high-low)/2;

            //if mid is grater than high, min is in right part
            if(arr[mid] > arr[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        System.out.println(minimum(arr));
    }
}
