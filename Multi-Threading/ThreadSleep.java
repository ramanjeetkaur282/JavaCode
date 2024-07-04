public class ThreadSleep {
    public static void main(String [] args){
        myThread t=new myThread();
        t.start();
        t.interrupt();
        System.out.println("End");
    }
}

class myThread extends Thread{
    public void run(){
        try{
            for (int i=0;i<10;i++){
                System.out.println("I am lazy Thread");
                Thread.sleep(2000);
            }
        }
        catch( InterruptedException e){
            System.out.println("I got interrupted!!!");
        }
    }
}
