package Binary_Search_Q;

public class SearchIn_Roted {

    //Function for Rotated Sorted Array
    public static int searchR(int[] arr, int target){
        int pivot = findPivot(arr);
        System.out.println(pivot);
        
        if(pivot == -1){
            //just do normal binary search because array is sorted
            return BS(arr, target, 0, arr.length-1);
        }

        //if pivot is found , you have to found 2 ASC sorted array

        if(arr[pivot] == target) return pivot;

        if(target >= arr[0]){
            return BS(arr, target, 0, pivot-1);
        }

        return BS(arr, target, pivot+1, arr.length-1);
    }


    //Binary Search
    public static int BS(int[] arr, int target, int start, int end){

        while (start<=end) {
            int mid = (start + end)/2;

            if(arr[mid] == target) return mid;
            if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end  = mid-1;
            }
        }

        return -1;
    }

    //Find pivot
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if( mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(searchR(arr, target));
    }
}
