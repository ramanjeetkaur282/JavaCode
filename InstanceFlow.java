package PracticeJuly;

public class InstanceFlow {
    int i=10;
    {
        m1();
        System.out.println("First Block"+i);
    }
    InstanceFlow(){
        System.out.println("Constructor");
    }

    public static void main(String [] args){
        InstanceFlow f=new InstanceFlow();
        System.out.println("Main");
    }
    public void m1(){
        System.out.println("Value of j"+j);
    }
    {
        System.out.println("Second Block");
    }
    int j=20;
}
