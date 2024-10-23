package queue;

public class slidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,5,-1,8,7,5,3,1,10,3};
        int n = arr.length;
        int k = 3;
        int j, max;
        int[] result = new int[n-k+1];
        for(int i = 0; i<=n-k; i++){
            max = arr[i];
            for(j = 1; j<k; j++){
                if(arr[i+j] > max){
                    max = arr[i+j];
                }
            }
            result[i] = max;
//            System.out.print(max + " ");
        }

        for(int i = 0; i< result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}
