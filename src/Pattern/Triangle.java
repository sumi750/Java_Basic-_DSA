package Pattern;

public class Triangle {
    public static void main(String[] args) {
        triangle(4,0);
        System.out.println();
        triangle2(4,0);
    }

    static void triangle(int row, int column){
        if(row == 0) return;

        //Printing till the row != column
        if(row > column){
            System.out.print("* ");
            triangle(row, column+1);
        }

        else{
            System.out.println();
            triangle(row-1,0);
        }
    }

    static void triangle2(int row, int column){
        if(row == 0) return;

        //Printing till the row != column
        if(row > column){
            triangle2(row, column+1);
            System.out.print("* ");
        }

        else{
            triangle2(row-1,0);
            System.out.println();

        }
    }
}
