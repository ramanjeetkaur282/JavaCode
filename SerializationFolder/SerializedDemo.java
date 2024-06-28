package SerializationFolder;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
    int i=10;
    int j=20;
}
public class SerializedDemo implements Serializable{
    public static void main(String []args){
       try{
        Dog d1=new Dog();
        //Serialization
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.close();

        //Deserialization
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Dog d2=(Dog)ois.readObject();

        System.out.println(d2.i+d2.j);
        ois.close();
       }
       catch(Exception e){
        e.printStackTrace();
       }

    }
}