package exerciseBasicSyntax;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;

        int startNumber=n;
        while(n>0)
        {
            int lastDigit=n%10;
            int multiply=1;
            for(int i=1;i<=lastDigit;i++)
            {
                multiply*=i;
            }
            sum+=multiply;
            n/=10;
        }
        if(sum==startNumber)
        {
            System.out.println("yes");
        }else
        {
            System.out.println("no");
        }
    }
}
