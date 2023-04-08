package RegularExpressionsMoreExercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String[] ticket=input.split("[, ]+");
        for (int i=0;i< ticket.length;i++)
        {
            if(ticket[i].length()==20)
            {
                String tickets=ticket[i];
                String left=tickets.substring(0,10);
                String right=tickets.substring(10,20);
                String leftMach="a";
                String rightMach="s";
                Pattern pattern=Pattern.compile("[\\\\@]{6,}|[\\\\$]{6,}|[\\\\#]{6,}|[\\\\^]{6,}");
                Matcher lm=pattern.matcher(left);
                Matcher rm=pattern.matcher(right);
                if(lm.find()){
                    leftMach=lm.group();
                }
                if (rm.find())
                {
                    rightMach=rm.group();
                }
                if(leftMach.substring(0,1).equals(rightMach.substring(0,1)))
                {
                    int matchCount=Math.min(leftMach.length(),rightMach.length());
                    if(matchCount==10)
                    {
                        System.out.printf("ticket \"%s\" - %d%s Jackpot!%n",tickets,matchCount,leftMach.substring(0,1));
                    }else{
                        System.out.printf("ticket \"%s\" - %d%s%n",tickets,matchCount,leftMach.substring(0,1));
                    }
                }else{
                    System.out.printf("ticket \"%s\" - no match%n",tickets);
                }
            }else{
                System.out.println("invalid ticket");
            }
        }
    }
}
