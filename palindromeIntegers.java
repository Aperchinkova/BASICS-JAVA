package exrMethod;

import java.util.Locale;
import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number=scanner.nextLine();
        while(!number.equals("END"))
        {
            if(!isPalindrome(number))
            {
                System.out.println("false");
            }else
            {
                System.out.println("true");
            }
            number=scanner.nextLine();
        }
    }
    private static boolean isPalindrome(String num)
    {
        String reversedString="";
        for(int i=num.length()-1;i>=0;i--)
        {
            reversedString+=num.charAt(i);
        }
        if(num.equals(reversedString))
        {
            return true;
        }else
        {
            return false;
        }
    }
}
