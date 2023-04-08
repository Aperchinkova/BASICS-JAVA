package methods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        String symbol=scanner.nextLine();
        int number2=Integer.parseInt(scanner.nextLine());
        System.out.printf("%.0f",calculate(number,symbol,number2));
    }
    public static double calculate(int a,String operator,int b)
    {
        double result=0;
        switch(operator)
        {
            case "/":
                result=a/b;
                break;
            case "*":
                result=a*b;
                break;
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
        }
        return result;
    }
}
