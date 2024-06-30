import java.util.Scanner;

public class Clock {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter time (HH:MM:SS): ");
        String time1=scanner.nextLine();

        System.out.println("Enter time 2 (HH:MM:SS): ");
        String time2=scanner.nextLine();

        String[] part1=time1.split(":");
        String[] part2=time2.split(":");

        int Hours1=Integer.parseInt(part1[0]);
        int Minutes1=Integer.parseInt(part1[1]);
        int Seconds1=Integer.parseInt(part1[2]);

        int Hours2=Integer.parseInt(part2[0]);
        int Minutes2=Integer.parseInt(part2[1]);
        int Seconds2=Integer.parseInt(part2[2]);

        int totalSeconds1= Hours1*3600+Minutes1*60+Seconds1;
        int totalSeconds2= Hours2*3600+Minutes2*60+Seconds2;

        int inDiffinSeconds=Math.abs(totalSeconds2-totalSeconds1);

        int diffHours=inDiffinSeconds/3600;
        inDiffinSeconds%=3600;
        int diffInMinutes= inDiffinSeconds/60;
        int diffInSeconds=inDiffinSeconds%60;


        System.out.printf("%02d:%02d:%02d%n",diffHours,diffInMinutes,diffInSeconds);

    }


}
