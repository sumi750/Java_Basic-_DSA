package Binary_Search_Q;

public class orderAgnosticBS {
    public static int OrderBS(int[] arr, int target){
        int s = 0;
        int end = arr.length-1;

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

    public static void main(String[] args) {
        int[] arr = {12,11,10,9,8,5,3,1};
        int target = 9;
        int ans = OrderBS(arr, target);
        System.out.println("Index of Target is " + ans);
    }
}
