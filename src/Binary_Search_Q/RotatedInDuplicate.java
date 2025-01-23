package Binary_Search_Q;

public class RotatedInDuplicate {
        //Function for Rotated Sorted Array
        public static boolean searchR(int[] arr, int target){
            int pivot = findPivot(arr);

            if(pivot == -1){
                //just do normal binary search because array is sorted
                return BS(arr, target, 0, arr.length-1);
            }

            //if pivot is found , you have to found 2 ASC sorted array

            if(arr[pivot] == target) return true;

            if(target >= arr[0]){
                return BS(arr, target, 0, pivot-1);
            }

            return BS(arr, target, pivot+1, arr.length-1);
        }


        //Binary Search
        public static boolean BS(int[] arr, int target, int start, int end){

            while (start<=end) {
                int mid = (start + end)/2;

                if(arr[mid] == target) return true;
                if(arr[mid] < target){
                    start = mid+1;
                }
                else{
                    end  = mid-1;
                }
            }

            return false;
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

                // if element at middle, start and end are equal then just skip the duplicates
                if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                    //skip the duplicates
                    //Note what if start and end where Pivot so
                    //check if start is pivot
                    if(arr[start] > arr[start+1]){
                        return start;
                    }
                    start++;

                    //check if end is pivot
                    if(arr[end] < arr[end-1]){
                        return end-1;
                    }
                    end--;
                }

                //left side is sorted, so pivot should be in right
                else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }

            }
            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {4,5,6,7,7,0,0,1,1,2};
            int target = 0;
            System.out.println(searchR(arr, target));
        }
    }
