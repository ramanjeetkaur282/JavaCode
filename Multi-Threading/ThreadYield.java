public class ThreadYield {
    public static void main(String [] args){
        myThread t=new myThread();
        t.start();
        for ( int i=0;i<10;i++){
            System.out.println("Thread Main");
        }
    }
}
class myThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
