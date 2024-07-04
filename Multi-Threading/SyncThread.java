public class SyncThread {
    public static void main(String [] args){
          Display d=new Display();
          myThread t1=new myThread(d, "Ramanjeet");
          t1.start();
          
    }
}
class Display{
    public void wish(String name){
        for (int i=0;i<10;i++){
            System.out.println("Display this");
        }
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println(name);
        }
    }
}

class myThread extends Thread{
    Display d;
    String name;
    myThread(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run()
{
    d.wish(name);
}}
