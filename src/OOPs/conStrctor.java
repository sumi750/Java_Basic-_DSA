package OOPs;

public class conStrctor {
    public static void main(String[] args) {
    Student s1 = new Student();   // default constructor calling
    s1.name = "Rajan";
    s1.roll=21;
    s1.percent = 92.3;
    s1.pass = 4521;
    s1.marks[0] = 78;
    s1.marks[1] = 88;
    s1.marks[2] = 90;
//    System.out.println(s1.name);
//    System.out.println(s1.roll);
//    System.out.println(s1.percent);
//    System.out.println(s1.pass);

    Student s2 = new Student("Rohan", 46, 92.6, 2589);   // constructor calling

//        System.out.println(s2.name);
//        System.out.println(s2.roll);
//        System.out.println(s2.percent);
//        System.out.println(s2.pass);


    // copy constructor
    Student s3 = new Student(s1);   // copy the data of s1
    s3.pass = 78965;
        System.out.println(s3.name);
        System.out.println(s3.roll);
        System.out.println(s3.percent);
        System.out.println(s3.pass);
        for(int i =0; i<3; i++){
            System.out.print(s3.marks[i] + " ");  // copied marks are here

        }

        s1.marks[2] = 100;
        System.out.println(s3.marks[2]);  // --> output is 100 Why? Ans: -Using Shallow Copy Concept

    }
}

// Shallow Copy:Changes of one object can be reflected in copied object.In shallow copy, new memory allocation never happens for the other entities, and the only reference is copied to the other entities.
// Deep Copy:Changes in one entity are not reflected in changes in another identity.



class Student{
    String name;
    int roll;
    double percent;
    int pass;

    int marks[];
    // default constructor
    public Student(){
                marks = new int[3];
                System.out.println("Default constructor is called...");
    }
    public Student(String name, int roll, double per, int pss){
        marks = new int[3];

        System.out.println(" constructor is called...");

        this.name = name;
        this.roll = roll;
        this.percent = per;
        this.pass = pss;
    }

    // Shallow COpy Constructor
    public Student(Student s1){
        System.out.println("Copy Constructor....");
        marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            this.percent = s1.percent;
            this.marks = s1.marks;   // shallow copy method
    }

}


