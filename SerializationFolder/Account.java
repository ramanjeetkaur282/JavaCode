import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable{
    String username="Ramanjeet";
    transient String password="secret";

    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject(); //Perform the default serialization
        String epwd="123"+password; // Encrypt the password
        os.writeObject(epwd); //Serialize the encrypted password
    }

    private void readObject(ObjectInputStream is) throws Exception{
        is.defaultReadObject(); //Perform the default deserialization
        String epwd=(String)is.readObject(); // Read the Encrypted the password
        password=epwd.substring(3); // Decrypted password
    }

    public static void main(String [] args){
    try{
        Account a1=new Account();
        System.out.println(a1.username+"..."+a1.password);
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);
        oos.close();

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a2=(Account)ois.readObject();
        ois.close();

        System.out.println(a2.username+"..."+a2.password);
    }
    catch(Exception e){
        e.getStackTrace();
    }
}
}
