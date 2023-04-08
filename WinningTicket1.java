package RegularExpressionsMoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        String[] tickets=input.split("[, ]+");
        for(int i=0;i< tickets.length;i++)
        {
            String ticket=tickets[i];//Cash$$$$$$Ca$$$$$$sh
            Pattern pattern=Pattern.compile("([@]{6,}|[#]{6,}|[$]{6,}|[\\^]{6,})");
            if(ticket.length()==20)//Cash$$$$$$Ca$$$$$$sh
            {
                String left=ticket.substring(0,10);//Cash$$$$$$
                String right=ticket.substring(10,20);//Ca$$$$$$sh
                Matcher matcher=pattern.matcher(ticket);//Cash$$$$$$Ca$$$$$$sh
                String leftMatch="a";
                String rightMatch="s";
                Matcher lm=pattern.matcher(left);
                Matcher rm=pattern.matcher(right);
                if(lm.find())
                {
                    leftMatch=lm.group();
                }
                if(rm.find())
                {
                    rightMatch=rm.group();
                }
                if(leftMatch.substring(0,1).equals(rightMatch.substring(0,1)))
                {
                    int countMatch=Math.min(leftMatch.length(),rightMatch.length());
                    if(countMatch==10)
                    {
                        System.out.printf("ticket \"%s\" - %d%s Jackpot!%n",ticket,countMatch,leftMatch.substring(0,1));
                    }else{
                        System.out.printf("ticket \"%s\" - %d%s%n",ticket,countMatch,leftMatch.substring(0,1));
                    }
                }else
                {
                    System.out.printf("ticket \"%s\" - no match%n",ticket);
                }

            }else{
                System.out.println("invalid ticket");
            }
        }
    }
}
