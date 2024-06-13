package TwoDArray;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row ");
        int n = sc.nextInt();
        System.out.print("Enter the value of column ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
//        int n = matrix.length,  m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // Out put
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
