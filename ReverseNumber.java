import java.util.Scanner;

class Reverse{
    public static void main(String []args){
        int reverse=0;
        int num=0;
        System.out.println("Enter the number: ");
        Scanner cin=new Scanner(System.in);
        num=cin.nextInt();
        try{
        while(num !=0){
            reverse=reverse*10;
            reverse=reverse +num%10;
            num=num/10;
        }
        System.out.println("Reverse of given Number is :"+reverse);
    }
    finally{
        cin.close();
    }
    }
}