public class eg2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Without using 3rd variable

        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
        a =  a+b;  //30
        b = a-b;  //30-20 --> 10
        a = a-b;

        System.out.println("a is " +a);
        System.out.println("b is "+b);
    }
}
