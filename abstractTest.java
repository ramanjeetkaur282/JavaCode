abstract class Vehicle {
    public abstract int getNumOfWheels();
}
class Bus extends Vehicle{
    public int getNumOfWheels(){
        return 6;
    }
}
class BiCycle extends Vehicle{
    public int getNumOfWheels(){
        return 2;
    }
}
public class abstractTest{
  public static void main(String [] args){
    Bus b=new Bus();
    System.out.println(b.getNumOfWheels());
    BiCycle b1=new BiCycle();
    System.out.println(b1.getNumOfWheels());
  }
}
