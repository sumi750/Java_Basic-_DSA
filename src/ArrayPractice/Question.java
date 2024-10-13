package ArrayPractice;
import java.util.*;
public class Question {
    public static int findOdd(int[] A, int q, int iA, int fA){
        int counter=0;
            for(int i=iA; i<=fA; i++){
                if(A[i] % 2 !=0){   //true means odd
                    counter++;
                }
            }
        return counter;

    }

    public static void main(String[] args) {
        int[] A = {3,4,7,1,6,2};
        int q = 2;
        int iA = 1;
        int fA = 4;
        int iB = 0;
        int fB = 3;
        int AOdd = findOdd(A, q, iA, fA);
        int BOdd = findOdd(A, q,  iB, fB);
        int max = Math.max(AOdd, BOdd);
        System.out.println(max);
    }
}
