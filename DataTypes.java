package MethodMoreExcercise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command= scanner.nextLine();
        String input= scanner.nextLine();
        switch (command)
        {
            case "int":
                int num=Integer.parseInt(input);
                multiplyBy2(num);
                break;
            case "real":
                double real=Double.parseDouble(input);
                realMultiplyAndFormat(real);
                break;
            case "string":
                stringFormattedPrint(input);
                break;
        }
    }
    private static void multiplyBy2(int n)
    {
        n*=2;
        System.out.println(n);
    }
    private static void realMultiplyAndFormat(double n)
    {
        n*=1.5;
        System.out.printf("%.2f",n);
    }
    private static void stringFormattedPrint(String input)
    {
        System.out.printf("$%s$",input);
    }
}
