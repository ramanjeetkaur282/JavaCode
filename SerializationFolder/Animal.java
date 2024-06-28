import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Animal {
    public static void main(String[] args){
    try{
        Dog d1=new Dog();
        FileOutputStream fos=new FileOutputStream("efg.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.close();

        FileInputStream fis=new FileInputStream("efg.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();

        System.out.println(d2.c.r.j);
        ois.close();
    }
    catch(Exception e){
        e.getStackTrace();
    }
    }
}

class Dog implements Serializable{
    Cat c=new Cat();
}
class Cat implements Serializable{
    Rat r=new Rat();
}

class Rat implements Serializable{
    int j=20;
}
