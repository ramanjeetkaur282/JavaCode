public class ThreadGroupDemo {
    public static void main(String [] args){
        ThreadGroup pg=new ThreadGroup("Parent Group");
        ThreadGroup cg=new ThreadGroup("Child Group");
        MyThread t1= new MyThread(pg,"Child Thread");
        MyThread t2= new MyThread(pg,"Child Thread");
        t1.start();
        t2.start();
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
        Thread.sleep(1000);
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
    }
}
class MyThread extends Thread{
    MyThread(ThreadGroup g,String name){
        super(g, name);
    }
    public void run(){
        System.out.println("Child Thread");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){}

    }
}
