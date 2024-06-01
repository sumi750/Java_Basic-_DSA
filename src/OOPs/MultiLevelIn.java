package OOPs;
import java.util.*;
public class MultiLevelIn {
    public static void main(String[] args) {
//        College c1 = new College();
//        c1.clg_name = "PUSSGRC";
//        c1.Print_name();

        Result s1 = new Result();   // s1 object is created
        s1.get_name("Panjab University ");
        s1.Print_name();
        s1.data("Sumit", 20, 99);
        s1.get_data();
        s1.getPer(98.4);
        s1.Print_per();

    }

}
class College{
    String clg_name;
    void get_name(String clgname){
        this.clg_name = clgname;
    }

    void Print_name(){
        System.out.println("College Name is = " + clg_name);
    }
}

class Stud extends College{
    String name;
    int age;
    int marks;
    // default
    public Stud(){

    }

    void data(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void get_data(){
        System.out.println("The name is = " + name);
        System.out.println("the age is =" +age);
        System.out.println("the marks are ="+marks);
    }


}

class Result extends Stud{
    double percent;
    void getPer(double percent){
        this.percent = percent;
    }

    void Print_per(){
        System.out.println("The Percent is =" + percent);
    }
}
