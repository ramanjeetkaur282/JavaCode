

public class OverridingPrivate {
   public static void main(){
    P p=new P();
    p.m1();
   } 
}

class P{
    private void m1(){
     System.out.println("Class P private method");
    }
}
class C extends P{
    private void m1(){
        System.out.println("Class C private method");
    }
}
