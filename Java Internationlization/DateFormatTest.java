
import java.text.DateFormat;
import java.util.*;

public class DateFormatTest{
    public static void main(String [] args){
        
        System.out.println("Date Time:"+DateFormat.getDateTimeInstance(0,0,Locale.US).format(new Date()));
        System.out.println("Full.."+DateFormat.getDateInstance(0,Locale.US).format(new Date()));
        System.out.println("Long.."+DateFormat.getDateInstance(1,Locale.US).format(new Date()));
        System.out.println("Medium.."+DateFormat.getDateInstance(2,Locale.US).format(new Date()));
        System.out.println("short.."+DateFormat.getDateInstance(3,Locale.US).format(new Date()));
        System.out.println("UK Full.."+DateFormat.getDateInstance(0,Locale.UK).format(new Date()));
        System.out.println("ITALY Long.."+DateFormat.getDateInstance(1,Locale.ITALY).format(new Date()));
    }
}