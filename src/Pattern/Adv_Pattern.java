package Pattern;

import java.util.Scanner;

public class Adv_Pattern {
    public static void hollow_rec(int row, int colum){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=colum; j++){
                // cell(i,j)
                if(i == 1 || i == row || j == 1 || j == colum){
                    // boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_pattern(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_pattern_down(int m){
        // Outer loop
        for(int i = m; i>=1; i--){
            for(int j=m; j>i; j--){
                System.out.print(" ");
            }

            // Stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Hollow Rectangle
        System.out.println("Hollow Rectangle");
        System.out.print("Enter the value of Row ");
        int r = sc.nextInt();
        System.out.println("Enter the value of Colum");
        int c = sc.nextInt();
        hollow_rec(r,c);

        // Inverted and rotated half - pyramid
        System.out.println("Inverted and rotated half - pyramid");
        int i = sc.nextInt();
        inverted_pattern(i);

        System.out.println("Inverted and Downward rotated half - pyramid");
        int m = sc.nextInt();
        inverted_pattern_down(m);

    }
}
