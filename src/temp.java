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

    public static boolean isSorted(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void removeD(int arr[]){
        int j = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
    }
    public static void main(String[] args) {
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
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        //Max and Min
        MaxandMin(arr);

        //Remove duplicate
        removeD(arr);
        System.out.println(Arrays.toString(arr));
    }
}
