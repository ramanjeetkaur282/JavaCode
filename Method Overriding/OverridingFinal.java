public class OverridingFinal {
    public static void main(){
     P p=new P();
     p.m1();
    } 
 }
 
 class P{
     public final void m1(){
      System.out.println("Class P private method");
     }
 }
 class C extends P{
     public void m1(){
         System.out.println("Class C private method");
     }
 }