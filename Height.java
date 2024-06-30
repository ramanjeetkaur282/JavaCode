import java.util.Scanner;

public class Height {
   
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter Height of first person in cm: ");
        double height1= cin.nextDouble();

        System.out.println("Enter Height of second person in cm: ");
        double height2= cin.nextDouble();

        double diff=Math.abs(height2-height1);
        System.out.println("Difference in cm: "+diff);

        cin.close();
    
    }
}

