package basicSyntax;

import java.util.Locale;
import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String day=scanner.nextLine().toLowerCase();
        int age=Integer.parseInt(scanner.nextLine());
        double price=0.0;
        if(day.equals("weekday"))
        {
            if((age>=0 && age<=18 )||(age>64 && age<=122))
            {
                price=12;
            }else if(age>18 && age<=64)
            {
                price=18;
            }
        }
        if(day.equals("weekend"))
        {
            if((age>=0 && age<=18)||(age>64 && age<=122))
            {
                price=15;
            }else if(age>18 && age<=64)
            {
                price=20;
            }
        }
        if(day.equals("holiday"))
        {
            if(age>=0 && age<=18)
            {
                price=5;
            }else if(age>18 && age<=64)
            {
                price=12;
            }else if(age>64 && age<=122)
            {
                price=10;
            }
        }
        if(price!=0)
        {
            System.out.printf("%.0f$",price);
        }else
        {
            System.out.println("Error!");
        }

    }
}
