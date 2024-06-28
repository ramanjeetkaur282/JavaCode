import java.io.*;


public class Externalize implements Externalizable{
    String s;
    int i;
    int j;

    public Externalize(){}
    
    public Externalize(String s, int i, int j){
        this.s=s;
        this.i=i;
        this.j=j;
    }
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException{
        out.writeObject(s); //Serialize string 's'
        out.writeInt(i); //Serialize int 'i'
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException{
        try{
        s=(String) in.readObject(); //Deserialize
        i=in.readInt();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    } 

    public static void main(String []args){
    try{
        Externalize e1=new Externalize("Ramanjeet", 789, 4356);
   
        //Serialization
        FileOutputStream fos=new FileOutputStream("xyz.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e1);
        oos.close();
 

        FileInputStream fis=new FileInputStream("xyz.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Externalize e2=(Externalize) ois.readObject();
        ois.close();

        System.out.println("Deserialized Object:");
        System.out.println("String:"+ e2.s);
       // System.out.println("Int: ",+ e2.i);
    }
        catch(Exception e){
            e.printStackTrace();
    }
    }

}
