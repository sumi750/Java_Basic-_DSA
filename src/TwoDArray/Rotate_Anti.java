package TwoDArray;

public class Rotate_Anti {

    public static void rotateAnti(int[][] mat){
        //step1-> reverse the reach row
        int n = mat.length;
        for(int i = 0; i < n; i++){
            int start = 0;
            int end = n-1;
            while(start<end){
                int temp = mat[i][end];
                mat[i][end] = mat[i][start];
                mat[i][start] = temp;
                start++;
                end--;
            }
        }

        //step2->performing transpose
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        rotateAnti(mat);

        for (int[] row : mat) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
