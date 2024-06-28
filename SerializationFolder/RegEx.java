import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
   public static void main(String [] args){
    int count=0;
    Pattern P=Pattern.compile("ab");
    Matcher M=P.matcher("abbbabba");
    while(M.find()){
        ++count;
        System.out.println(M.start()+"..."+M.end()+"-"+M.group());
      
    }
    System.out.println("The total number of occur:"+count);
   } 
}
