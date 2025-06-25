package TwoDArray;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setZeroes(matrix);


        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }



    public static void setZeroes(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        boolean firstRow = false;
        boolean firstCol = false;

        //step1
        for(int i=0; i<n; i++){
            if(matrix[i][0] == 0) firstRow = true;
        }

        for(int j=0; j<m; j++){
            if(matrix[0][j] == 0) firstCol = true;
        }

        //step2
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }


        //step3
        for(int i= 0; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][0] ==0 || matrix[0][j] == 0 ) matrix[i][j] = 0;
            }
        }

        //step4 handling firstRow and firstCol

        if(firstRow){
            for(int j=0; j<m; j++){
                matrix[0][j] = 0;
            }
        }

        if(firstCol){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }


    }

}
