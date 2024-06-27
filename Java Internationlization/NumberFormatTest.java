import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String [] args){
        double d=123456.789;
        NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
        System.out.println("Italy Form is.."+nf.format(d));
    }
    
}
