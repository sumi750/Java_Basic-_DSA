package OOPs;

public class AbstractClass {

    public static void main(String[] args) {
        CAR mustang = new FORD();
        mustang.offEngine();
        mustang.run();
        mustang.startEngine();

        //can't create the object of abstract class like CAR c1 = new CAR()
    }
}


abstract class CAR{

    abstract void startEngine();  //can't define the method  due to abstract method
    abstract void offEngine();

    void run(){
        System.out.println("120 km per hours....");
    }
}

class FORD extends CAR{
    @Override
    void startEngine() {
        System.out.println("Engine is Started ");
    }

    @Override
    void offEngine() {
        System.out.println("Engine is offed  ");
    }
}
