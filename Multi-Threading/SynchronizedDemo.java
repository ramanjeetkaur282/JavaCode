public class SynchronizedDemo {
    public static void main(String [] args){
        Display d=new Display();
        myThread t1=new myThread(d);
        myThread t2=new myThread(d);
        t1.start();
        t2.start();
    }
}
class Display{
    public synchronized void displayn(){
        for(int i=0;i<10;i++){
            System.out.println("Value of i"+i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("I am Interrupted !!!");
            }
        }
    }
    public synchronized void display(){
        for(int i=65;i<75;i++){
            System.out.println("Value of i"+(char)i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("I am Interrupted again !!!");
            }
        }
    }
}

class myThread extends Thread{
    Display d;
    myThread(Display d){
        this.d=d;
    }
    public void run(){
        d.displayn();
    }

}
