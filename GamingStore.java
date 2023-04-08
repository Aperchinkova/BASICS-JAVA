package moreExerciseNasicSyntax;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double currentBalance=Double.parseDouble(scanner.nextLine());
        double start=currentBalance;
        double sum=0;
        String command=scanner.nextLine();
        while(!command.equals("Game Time"))
        {
            if(!(command.equals("OutFall 4")||command.equals("CS: OG")||command.equals("Zplinter Zell")||command.equals("Honored 2")||command.equals("RoverWatch")||command.equals("RoverWatch Origins Edition")))
            {
                System.out.println("Not Found");
                command=scanner.nextLine();
                continue;
            }
            if(command.equals("OutFall 4"))
            {
                if(currentBalance<39.99)
                {
                    System.out.println("Too Expensive");
                }else
                {
                    currentBalance-=39.99;
                    sum+=39.99;
                    System.out.printf("Bought %s%n",command);
                }

            }else if(command.equals("CS: OG"))
            {
                if(currentBalance<15.99)
                {
                    System.out.println("Too Expensive");
                }else
                {
                    currentBalance-=15.99;
                    sum+=15.99;
                    System.out.printf("Bought %s%n",command);
                }

            }else if(command.equals("Zplinter Zell"))
            {
                if(currentBalance<19.99)
                {
                    System.out.println("Too Expensive");
                }else
                {
                    currentBalance-=19.99;
                    sum+=19.99;
                    System.out.printf("Bought %s%n",command);
                }

            }else if(command.equals("Honored 2"))
            {
                if(currentBalance<59.99)
                {
                    System.out.println("Too Expensive");
                }else
                {
                    currentBalance-=59.99;
                    sum+=59.99;
                    System.out.printf("Bought %s%n",command);
                }

            }else if(command.equals("RoverWatch"))
            {
                if(currentBalance<29.99)
                {
                    System.out.println("Too Expensive");
                }else
                {
                    currentBalance-=29.99;
                    sum+=29.99;
                    System.out.printf("Bought %s%n",command);
                }

            }
            if(command.equals("RoverWatch Origins Edition"))
            {
                if(currentBalance<39.99)
                {
                    System.out.println("Too Expensive");
                }else
                {
                    currentBalance-=39.99;
                    sum+=39.99;
                    System.out.printf("Bought %s%n",command);
                }

            }

            if(currentBalance<=0)
            {
                System.out.println("Out of money");
                return;
            }

            command=scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",sum,start-sum);
    }
}