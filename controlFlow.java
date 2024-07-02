package PracticeJuly.PracticeJuly;

/* 1. Identification of static members from top to bottom.
 * 2. Executing static variable assignments and static blocks from top to bottom.
 * 3. Exceuting Main methods
 */
public class controlFlow{

    // Read indirectly, write only (i=0)
    static int i=10;
    static{
        m1();
        System.out.println("First Static Block");
    }
    public static void main(String[] args){
        m1();
        System.out.println("Main Method");
    }
    public static void m1(){
        System.out.println("value of j"+j);
    }
    static{
        System.out.println("Second Static Block");
    }

    static int j=20;
}

    
