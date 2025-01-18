package Binary_Search_Q;

public class findInMountain {

    public static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = (start+end)/2;
            if(arr[mid] > arr[mid+1]){
                //We are in the Dec part of Array
                //This may be ans, but look at the left
                end = mid;
            }
            else{
                //you are in Asc part of Array,
                start = mid+1;  //because mid+1 > mid
            }
        }
        //in the end, start == end and pointing the largest element because the 2 checks of above
        //start and end always trying to find the max element in the above 2 checks
        return arr[start];  // or return arr[end]
    }

    public static int OrderBS(int[] arr, int target, int s, int end){

        boolean isAsc = arr[s] < arr[end];

        while(s<=end) {
            int mid = s + (end - s) / 2;

            if (arr[mid] == target) return mid;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    s = mid + 1;
                }

            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int searchMountain(int[] arr, int target){
        int n = arr.length;
        int peak = peakElement(arr);
        int firstTry = OrderBS(arr, target, 0, peak);
        if(arr[firstTry] == target){
            return firstTry;
        }

        int lastTry = OrderBS(arr, target, peak+1, n-1);
        if(arr[lastTry] == target){
            return lastTry;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1};
        int target = 3;
        System.out.println("Index of target element is "+ searchMountain(arr, target));
    }
}
