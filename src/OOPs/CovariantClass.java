package OOPs;
public class CovariantClass {
    public static void main(String[] args) {
        Client c = new Client();
        c.login();
    }
}
class User{

    User login(){
        System.out.println("Login In User");
        return this;
    }
}

class Client extends User{
    Client login(){
        System.out.println("Client Login");   // we can change the return type of method

        return this;
    }
}