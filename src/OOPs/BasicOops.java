package OOPs;
//import java.util.*;
public class BasicOops {
    

    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1 , declaration

//        Student s1 = new Student("Sumit", 46, 92.2);
//        System.out.println("The name is " + s1.name );
//        System.out.println("The roll is " + s1.roll );
//        System.out.println("The percentage is " + s1.percentage );

//        s1.name = "Sun";
//        s1.roll = 46;  private access
//        s1.percentage = 90.5;
//        System.out.println(s1.name);

//        System.out.println(s1.getRoll());
//        s1.setRoll(46);
//        System.out.println(s1.getRoll());




    }
}

//class Student{
//    int roll;
//    String name;
//    double percentage;
//
//    // for not facing the error makes normal argument constructor as well as default constructor
//    public Student(){
//        // default constructor
//    }
//
//    //  constrctor calling
//    public Student(String naam, int rolll, double per){
//        name = naam;
//        roll = rolll;
//        percentage = per;
//    }
//
//    public int getRoll(){  // getter function
//        return roll;
//    }
//
//    public void setRoll(int roll){  // setter function  as well as get new value
//        this.roll = roll;   // this make sure the attribute of the created class
////        return roll;
//    }
//
//}


class Pen{
    String name;
    String color;
    int tip;

    void setName(String setName){
        name = setName;
    }

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
