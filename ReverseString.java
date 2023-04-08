package moreExerciseNasicSyntax;

import java.util.List;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        String name=scanner.nextLine();
        char ch;
        String reversed="";
        for(int i=0;i<name.length();i++)
        {
            ch=name.charAt(i);
            reversed=ch+reversed;
        }
        System.out.println(reversed);
         */
        String input= scanner.nextLine();
        char[] try1=input.toCharArray();
        for(int i= try1.length-1;i>=0;i--)
        {
            System.out.print(try1[i]);
        }
    }
}
