import java.util.Scanner;

public class LargestNumber {
    
    public static void main(String [] args){

        Scanner cin=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int x=cin.nextInt();
        System.out.println("Enter Second Number:");
        int y=cin.nextInt();
        System.out.println("Enter Third Number:");
        int z=cin.nextInt();

        try{
            if(x>y && y>z){
                System.out.println("The largest Number is: "+x);
            }
            else if(y>z){
                System.out.println("The largest Number is: "+y);
            }
           else{
                System.out.println("The largest Number is: "+z);
            }
        }
        finally{
            cin.close();
        }

    }
}
