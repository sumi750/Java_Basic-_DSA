package OOPs;
//import java.util.*;
public class BasicOops{
    public static void main(String[] args) {
         Pen p1 = new Pen();
         p1.setColor("Blue");
         p1.setTip(2);
         p1.setPrice(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        System.out.println(p1.getPrice());
    }
}

class Pen{
    //Properties + functions
    private String color;
    private int tip;
    private int price;

    // Getter
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    int getPrice(){
        return this.price;
    }

    //Setter
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }

    void setPrice(int newPrice){
        price = newPrice;
    }
}

