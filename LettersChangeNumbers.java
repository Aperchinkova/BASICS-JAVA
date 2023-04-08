package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String[] codes=input.split("\\s+");
        double totalSum=0;
        for (String code:codes)
        {
            double number=getModified(code);
            totalSum+=number;
        }
        System.out.printf("%.2f",totalSum);
    }
    private static double getModified(String code)
    {
        char firstLetter=code.charAt(0);//'A'
        char secondLetter=code.charAt(code.length()-1);//'b'
        double number=Double.parseDouble(code.replace(firstLetter,' ')//" 12b"
                .replace(secondLetter,' ')//" 12 "
                .trim());//"12"->12
        if(Character.isUpperCase(firstLetter))
        {
            //главна буква
            //аски код: [65; 90]
            int positionUpperLetter=(int)firstLetter-64;
            number/=positionUpperLetter;
        }else
        {
            //малка буква
            //аски код: [97; 122]
            int positionLowerCase=(int)firstLetter-96;
            number*=positionLowerCase;
        }
        if(Character.isUpperCase(secondLetter))
        {
            //главна буква
            //аски код: [65; 90]
            int positionUpperLetter=(int)secondLetter-64;
            number-=positionUpperLetter;
        }else
        {
            //малка буква
            //аски код: [97; 122]
            int positionLowerCase=(int)secondLetter-96;
            number+=positionLowerCase;
        }
        return number;
    }
}
