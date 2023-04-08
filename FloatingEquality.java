package DataTypesAndVariablesMoreExcercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        BigDecimal number1=new BigDecimal(scanner.nextLine());
        BigDecimal number2=new BigDecimal(scanner.nextLine());
        BigDecimal difference=(number1.subtract(number2)).abs();
        if(number1.compareTo(number2)==0)
        {
            System.out.println("True");
        }else
        {
            if(difference.compareTo(BigDecimal.valueOf(0.000001))==-1)
            {
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
         */
        double a=Double.parseDouble(scanner.nextLine());
        double b=Double.parseDouble(scanner.nextLine());
        double epsilon=0.000001;
        if(a>b)
        {
            if(a-b<=epsilon)
            {
                System.out.println("True");
            }else
            {
                System.out.println("False");
            }
        }
        else if(a<b)
        {
            if(b-a<=epsilon) {
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
}
