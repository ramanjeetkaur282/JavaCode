import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Book {
   String a="Fault in Our Stars"; 
}

class Journal extends Book implements Serializable{
    String b="The host";

    public static void main(String [] args){
        Journal j1=new Journal();
        j1.a="Fault";
        j1.b="Guest";

        try{
            FileOutputStream fos=new FileOutputStream("book.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(j1);
            oos.close();

            FileInputStream fis=new FileInputStream("book.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Journal j2=(Journal)ois.readObject();
            ois.close();
            System.out.println(j2.a+j2.b);
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
