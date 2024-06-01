package OOPs;
/*Inheritance is when properties & methods of
 base class are passed on to a derived class.
 */
public class InheritanceB {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.swim();
        shark.color = "Blue";
        System.out.println(shark.color);
    }
}

// Base Class
class Animal{
    String name;
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}


// Derived Class
// Single level Inheritance: - Single base class and single derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in Water");
    }
}


