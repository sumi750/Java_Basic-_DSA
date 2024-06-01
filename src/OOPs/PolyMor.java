package OOPs;
import java.util.*;
public class PolyMor {

    public static class cal{
        int sum(int a, int b){
            return a+b;
        }
        double sum(double a, double b){
            return a+b;
        }
        int sum(int a, int b, int c){
            return a+b+c;
        }
        float sum(float a, float b){
            return a+b;
        }
    }


    public static void main(String[] args) {
        // Method Overloading: Same function name but different parameters
        cal c1 = new cal();
        System.out.println(c1.sum(45,25));
        System.out.println(c1.sum(45,25,58));
//        System.out.println(c1.sum(45.5,25.9));
        System.out.println(c1.sum(45.5,25.9));

    }
}
