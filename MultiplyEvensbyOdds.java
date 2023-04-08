package methods;

import java.util.Scanner;

public class MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Math.abs(Integer.parseInt(scanner.nextLine()));
        int result=getMultipleOfEvensAndOdds(n);
        System.out.println(result);
    }
    public static int getMultipleOfEvensAndOdds(int n)
    {
        int evensSum=getEvenSum(n);
        int oddsSum=getOddSum(n);
        return evensSum*oddsSum;
    }
    public static int getEvenSum(int n)
    {
        int evenSum=0;
        while(n>0)
        {
            int number=n%10;
            if(number%2==0)
            {
                evenSum+=number;
            }
            n/=10;
        }
        return evenSum;

    }
    public static int getOddSum(int n)
    {
        int oddSum=0;
        while(n>0)
        {
            int numb=n%10;
            if(numb%2!=0)
            {
                oddSum+=numb;
            }
            n/=10;
        }
        return oddSum;
    }
}
