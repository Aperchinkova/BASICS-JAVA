package MoreExercisesArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortandPrintArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int numbers[]=new int[n];
        for(int i=0;i<n;i++)
        {
            String input= scanner.nextLine();
            int len=input.length();
            int sum=0;
            for(int j=0;j<input.length();j++)
            {
                char letter=input.charAt(j);
                if(isVowel(letter))
                {
                    sum+=letter*len;
                }else if(isConsonant(letter))
                {
                    sum+=letter/len;
                }
            }
            numbers[i]=sum;
        }
        Arrays.sort(numbers);
        for (int el: numbers) {
            System.out.println(el);
        }
    }
    public static boolean isVowel(char l)
    {
        String vowels="aeiouAEIOU";
        return vowels.contains(l+"");
    }
    public static boolean isConsonant(char l)
    {
        String cons="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(l+"");
    }
}
