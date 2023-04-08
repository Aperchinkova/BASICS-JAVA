package exrMethod;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
        int third=Integer.parseInt(scanner.nextLine());
        System.out.println(sum(first,second,third));
    }
    private static int sum(int a ,int b,int c)
    {
        return (a+b)-c;
    }
}
