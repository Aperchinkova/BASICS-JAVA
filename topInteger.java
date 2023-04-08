package exrMethod;

import java.util.Scanner;

public class topInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=n;i++)
        {
            if(isSumOfDigitsDivisibleBy8(i) && atLeastOneOddDigit(i))
            {
                System.out.println(i);
            }
        }
    }
    private static boolean isSumOfDigitsDivisibleBy8(int number)
    {
        int sumDigits=0;
        while(number>0)
        {
            int lastDigit=number%10;
            sumDigits+=lastDigit;
            number/=10;
        }
        if(sumDigits%8==0) {
            return true;
        }else
        {
            return false;
        }
    }
    private static boolean atLeastOneOddDigit(int number)
    {
        while(number>0)
        {
            int lastDigit=number%10;
            if(lastDigit%2==1)
            {
                return true;
            }
            number/=10;
        }
        return false;
    }
}
