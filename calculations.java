package methods;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command=scanner.nextLine();
        int firstInput=Integer.parseInt(scanner.nextLine());
        int secondInput=Integer.parseInt(scanner.nextLine());

        switch(command)
        {
            case "add":
                add(firstInput,secondInput);
                break;
            case "multiply":
                multiply(firstInput,secondInput);
                break;
            case "subtract":
                subtract(firstInput,secondInput);
                break;
            case "divide":
                divide(firstInput,secondInput);
                break;
        }

    }
    public static void add(int a,int b)
    {
        int result=a+b;
        System.out.println(result);
    }
    public static void multiply(int a,int b)
    {
        int result=a*b;
        System.out.println(result);
    }
    public static void subtract(int a,int b)
    {
        int result=a-b;
        System.out.println(result);
    }
    public static void divide(int a,int b)
    {
        int result=a/b;
        System.out.println(result);
    }

}
