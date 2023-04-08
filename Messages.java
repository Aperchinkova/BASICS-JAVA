package moreExerciseNasicSyntax;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbersOfPush=Integer.parseInt(scanner.nextLine());
        String message="";
        for(int i=0;i<numbersOfPush;i++)
        {
            String digits= scanner.nextLine();//44
            int digitlength=digits.length();//2
            char firstDigit=digits.charAt(0);//4
            int mainDigit=Character.getNumericValue(firstDigit);//4
            int offset=(mainDigit-2)*3;//6
            if(mainDigit==8||mainDigit==9)
            {
                offset=(mainDigit-2)*3+1;
            }
            int letterIndex=offset+digitlength-1;
            int letterCode=letterIndex+97;
            char letter=(char)letterCode;
            if(mainDigit==0)
            {
                letter=(char)(mainDigit+32);
            }
            message+=letter;
        }
        System.out.println(message);
    }
}
