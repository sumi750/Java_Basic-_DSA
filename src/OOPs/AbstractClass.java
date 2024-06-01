package OOPs;
import java.awt.desktop.SystemEventListener;
import java.util.*;
public class AbstractClass {
    public static void main(String[] args) {
//        final int a  = 45;
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();
        c.walk();

//        AnimalA a = new AnimalA();  can't create this due to abstract restrictions


    }
}
//Abstraction:
abstract class AnimalA{
    String color;
    AnimalA(){
        color = "brown";    // by default the color is brown until we don't change it from subclasses.
    }
    void eat(){
        System.out.println("Animal Eats");
    }

    abstract void walk();  // can't implementation , SubClasses will define it

}
// concrete Subclass: - provides implementations for all of its inherited abstract methods.
class Horse extends AnimalA{
    void changeColor(){
        color = "Dark Brown";
    }
    @Override
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends AnimalA{
    void changeColor(){
        color = "fade White";
    }
    @Override
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}