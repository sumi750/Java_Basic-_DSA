package TwoDArray;
import java.math.BigInteger;
import java.util.*;

public class spiralMatrix {

        public static ArrayList<Integer> spirallyTraverse(int[][] mat){
            ArrayList<Integer> ans = new ArrayList<>();
            int rowStart=0, rowEnd = mat.length-1;
            int colStart=0, colEnd = mat[0].length-1;

            while(rowStart<=rowEnd && colStart<=colEnd){

                //Top
                for(int j=colStart; j<=colEnd; j++){
                    ans.add(mat[rowStart][j]);
                }
                rowStart++;

                //Right
                for(int j=rowStart; j<=rowEnd; j++){
                    ans.add(mat[j][colEnd]);
                }
                colEnd--;

                //Bottom
                if(rowStart<=rowEnd){
                    for(int j=colEnd; j>=colStart; j--){
                        ans.add(mat[rowEnd][j]);
                    }
                    rowEnd--;
                }

                //Left
                if(colStart<=colEnd){
                    for(int j=rowEnd; j>=rowStart; j--){
                        ans.add(mat[j][colStart]);
                    }
                    colStart++;
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            int[][] mat = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            ArrayList<Integer> res = spirallyTraverse(mat);
            for (int num : res) {
                System.out.print(num + " ");
            }
        }
}
