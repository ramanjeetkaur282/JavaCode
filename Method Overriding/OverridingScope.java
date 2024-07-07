//We cannot reduce scope of access modifiers. We can increase the scope.
public class OverridingScope {
   public static void main(String [] args){
    P p=new P();
    p.m1();
   } 
}
class P{
    public void m1(){
        System.out.println("Class P");
    }
}
class C extends P{
    protected void m1(){
        System.out.println("Class C");
      
    }
}
