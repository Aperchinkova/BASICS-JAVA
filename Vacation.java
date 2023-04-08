package exerciseBasicSyntax;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String type=scanner.nextLine();
        String day=scanner.nextLine();
        double price=0.0;

        if(type.equals("Students"))
        {
            switch(day)
            {
                case "Friday":
                    price=8.45;
                    break;
                case  "Saturday":
                    price=9.80;
                    break;
                case "Sunday":
                    price=10.46;
                    break;
            }
            if(n>=30)
            {
                System.out.printf("Total price: %.2f",(n*price)-(n*price)*0.15);
            }else
            {
                System.out.printf("Total price: %.2f",n*price);
            }

        }
        if(type.equals("Business"))
        {
            switch(day)
            {
                case "Friday":
                    price=10.90;
                    break;
                case  "Saturday":
                    price=15.60;
                    break;
                case "Sunday":
                    price=16;
                    break;
            }
            if(n>=100)
            {
                System.out.printf("Total price: %.2f",n*price-10*price);
            }else
            {
                System.out.printf("Total price: %.2f",n*price);
            }

        }
        if(type.equals("Regular"))
        {
            switch(day)
            {
                case "Friday":
                    price=15;
                    break;
                case  "Saturday":
                    price=20;
                    break;
                case "Sunday":
                    price=22.50;
                    break;
            }
            if(n>=10 && n<=20)
            {
                System.out.printf("Total price: %.2f",n*price-0.05*(n*price));
            }else
            {
                System.out.printf("Total price: %.2f",n*price);
            }

        }


    }
}
