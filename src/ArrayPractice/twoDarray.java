package ArrayPractice;

import java.util.Scanner;

public class twoDarray {

    // Searching in Matrix
    public static boolean Searching(int matrix[][], int key){

        int row = matrix.length;
        int column = matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
//                System.out.print(matrix[i][j] + " ");
                if(matrix[i][j] == key){
                    System.out.println(matrix[i][j] + " ");
                    return true;
                }
            }
//            System.out.println();
        }
        System.out.println("Not Found");
        return  false;
    }

    // 2D Array : - uses: formation of matrix
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3]; //3X3 matrix

        int row = matrix.length;  // rows length
        int column = matrix[0].length; // matrix[0] represents the rows and .length gives the length of that row
        System.out.print("Enter the Matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // OutPut
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("enter the key you want to search");
        int key = sc.nextInt();
        boolean find  = Searching(matrix,key);

        System.out.println(find);

    }

}

