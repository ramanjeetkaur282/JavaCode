import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest2 {
    public static void main(String[] args){
        double d= 123456.789;
        Locale India=new Locale.Builder().setLanguage("pa").setRegion("IN").build();
        NumberFormat nf=NumberFormat.getCurrencyInstance(India);
        System.out.println("India Form is.."+nf.format(d));

        NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US Form is.."+nf1.format(d));

        NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("UK Form is.."+nf2.format(d));

        NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println("ITALY Form is.."+nf3.format(d));


    }
}
