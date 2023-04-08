package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        String res="";
        char firstOccur=text.charAt(0);
        res+=firstOccur;
        for (int i=1;i<text.length();i++)
        {
            char currentSymbol=text.charAt(i);
            if (currentSymbol!=firstOccur)
            {
                res+=currentSymbol;
                firstOccur=currentSymbol;
            }
        }
        System.out.println(res);

    }
}
