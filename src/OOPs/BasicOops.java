package OOPs;
import java.util.*;

public class BasicOops{

    public static class Student{
        private String name;
        private int age;
        private int marks ;


        //setter()
        void setName(String name){
            this.name = name;
        }
        void setAge(int age){
            if(age > 0){
                this.age = age;
            }
            else{
                System.out.println("Invalid Age");
            }
        }

        void setMarks(int marks){
            this.marks = marks;
        }

        //getter()

        String getName(){return name;}
        int getAge(){return age;}
        int getMarks(){return marks;}

    }


    public static void main(String[] args) {
         Student s1 = new Student();
         s1.setName("Sumit");
         s1.setAge(18);
         s1.setMarks(96);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getMarks());
    }
}


