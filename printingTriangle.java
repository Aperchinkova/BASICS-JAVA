package methods;

import java.util.Scanner;

public class printingTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        print(n);
    }
    public static void print(int num)
    {
        for(int i=1;i<=num;i++)
        {
            elements(1,i);
        }
        for(int i=num-1;i>=1;i--)
        {
            elements(1,i);
        }
    }
    public static void elements(int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
