package JavaBasicProblems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongNumber {
    static boolean isArmstrong(int n)
    {
        int temp,digits=0,last=0,sum=0;
        temp=n;
        while(temp>0)
        {
            temp/=10;
            digits++;
        }
        temp=n;
        while(temp>0)
        {
            last=temp%10;
            sum+=(Math.pow(last,digits));
            temp/=10;
        }
        if(n==sum)
        {
            return  true;
        }else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int num= scanner.nextInt();
        System.out.println("Armstrong Number up to "+ num + " are: ");
        for(int i=0;i<=num;i++)
        {
            if(isArmstrong(i))
            {
                System.out.print(i+",");
            }
        }
    }
}
