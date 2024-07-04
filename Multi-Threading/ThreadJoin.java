public class ThreadJoin {
    public static void main(String [] args) throws InterruptedException{
           myThread t=new myThread();
           t.start();
           t.join();
           for(int i=0;i<10;i++){
            System.out.println("Raman Thread");
           }
    }
}
class myThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
           }
    }
}