public class overloadedThread {
   public static void main (String [] args){
     myThread t= new myThread();
     t.start();
   } 
}

class myThread extends Thread{
    public void run(){
        System.out.println("No-args run method");
    }
    public void run(int i){
        System.out.println("Int-args run method");
    }
}
