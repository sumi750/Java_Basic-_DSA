package Pattern;
import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Star Pattern --> Right Side
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Inverted Pattern");
        // Inverted star pattern
        for(int i=1; i<=n; i++){
            for( int s=1; s<=(n-i+1); s++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Half - Pyramid Pattern");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // Character Pattern
        System.out.println("Character Pattern In Triangle ");
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        System.out.println("Pattern in Triangle  Or FLoyd;s Triangle ");
        int l = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(l+" ");
                l++;
            }
            System.out.println();
        }
    }
}
