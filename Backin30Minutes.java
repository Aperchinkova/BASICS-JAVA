package basicSyntax;

import java.util.Scanner;

public class Backin30Minutes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hours=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());
        int totalminutes=hours*60+minutes+30;
        int hourAfter30minutes=totalminutes/60;
        int minutesAfter30minutes=totalminutes%60;
        if(hourAfter30minutes>23)
        {
            hourAfter30minutes=0;
        }
        if(minutesAfter30minutes>=1 && minutesAfter30minutes<=9)
        {
            System.out.printf("%d:0%d",hourAfter30minutes,minutesAfter30minutes);
        }
        else
        {
            System.out.printf("%d:%d",hourAfter30minutes,minutesAfter30minutes);
        }



    }
}
