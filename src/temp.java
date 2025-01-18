import javax.sound.midi.Soundbank;
import java.util.*;
public class temp {

    //Reverse of Array
    public static void reverseArray(int[] arr){
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    //Max and Min value in Array
    public static void MaxandMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                 min = arr[i];
            }

        }

        System.out.println("Max value is "+ max);
        System.out.println("Min Value is "+ min);
    }


    //IsSorted Or Not
    public static boolean isSorted(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    //Gives the unique elements count from array
    public static int removeD(int arr[]){
        int j = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        arr[j] = arr[n-1];
        j++;
        return j;

    }


    //Remove Duplicate
    public static int remove(int[] arr){
        if(arr.length == 0) return 0;

        //Sorting the array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int j = 0;
        for(int i = 1; i< arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }


    //Rotate Elements by k Steps
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        int p = 1;

        while(p<=k){
            int first = arr[0];

            //Shifting the elements by 1 step
            for(int i = 0; i<n-1; i++){
                arr[i] = arr[i+1];
            }

            //Put first element in last
            arr[n-1] = first;
            p++;
        }

    }

    //Second Largest Elements in Array -->(If there is No duplicate largest element)
    public static int largestSecond(int[] arr){
        int max1;
        int max2;
        if(arr[0] > arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        }
        else{
            max1 = arr[1];
            max2 = arr[0];
        }

        for(int i=2; i< arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }

        System.out.println("Largest element is Array is "+ max1);
        return max2;
    }

    //Second Largest Element in Array (if there duplicate largest elements)
    public static void largestSecondd(int[] arr){
        int size = arr.length;
        Arrays.sort(arr); // Gives the sorted Array
        if(size < 2) {
            System.out.println("Invalid Input ");
            return;
        }

        for(int i = size-2; i>=0; i--){
            if(arr[i] != arr[size-1]){
                System.out.println("Second largest element is "+ arr[i]);
                return;
            }
        }
    }


    //Move all zeros to end of array
    public static void moveZeros(int[] arr){
        int count = 0;
        int size = arr.length;

        for(int i = 0; i<size; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        while(count < size){
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[] arr = {"mass", "as", "hero", "superhero"};
//        ArrayList<String> list = new ArrayList<>();
//        for(int i = 0; i< arr.length; i++){
//            for(int j=0; j< arr.length; j++){
//                if(i == j ) continue; // miss kar raha tha
//                if(arr[i].contains(arr[j])){
//                    list.add(arr[j]);
//                    break;
//         }
//            }
//        }
//        System.out.println(list.size());
//        for(int i = 0; i< list.size(); i++){
//            System.out.print(list.get(i)+ " ");
//        }
        int[] arr =  { 1,5,8,8,9,10,10,17};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        //IsSorted
        boolean sort = isSorted(arr);
        if(sort) System.out.println("Sorted");
        else System.out.println("Not sorted");
        //Reverse
        System.out.println("Reverse an array ");
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        //Max and Min
        System.out.println("Min and Max in Array ");
        MaxandMin(arr);

        System.out.println("No of Unique elements in array " + removeD(arr));
        int[] a = {4,8,6,9,2,4,1,9,8,1};
        //Remove Duplicate Changes in the Actual Array --> Using constant extra space
        int n = remove(a);   // changes the array and gives the length of array

        for(int i =0; i<n; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        //Rotate Array by K Steps
        System.out.println("Rotating array by K steps");
        int[] arr2 = {1,5,9,7,6,2,3,7,10};
        int k = sc.nextInt();
        rotate(arr2, k);
        System.out.println(Arrays.toString(arr2));

        //Second largest element in array (if there is no duplicate elements)
        int[] m = {5,9,7,6,3,4,6,3,12,4,8,10};
        System.out.println("Second Largest Element in this Array is "+ largestSecond(m));

        int[] x = {5,9,7,6,3,4,6,12,3,12,4,8,10};
        largestSecondd(x);

        //move All zeros to the end array
        int[] z = {0,5,0,7,9,0,6,4,3,0,1};
        moveZeros(z);
        System.out.println(Arrays.toString(z));

        //Check if the 2 arrays are equal or not
        

    }
}
