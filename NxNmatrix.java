package exrMethod;

import java.util.Scanner;

public class NxNmatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=n;i++)
        {
            printLine(n);
        }
    }
    private static void printLine(int number)
    {
        for(int i=1;i<=number;i++)
        {
            System.out.print(number+" ");
        }
        System.out.println();
    }

}
