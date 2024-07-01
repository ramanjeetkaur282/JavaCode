//Method Hiding in Static Methodss
public class Hiding {
    public static void main(String [] args){
        System.out.println("Parent Main");
    }
}

class C extends Hiding{
    public static void main(String [] args){
        System.out.println("Child Class");
    }
}
