package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        StringBuilder text=new StringBuilder(input);
        int totalStrength=0;
        for (int position=0;position<text.length();position++)
        {
            char currentSymbol=text.charAt(position);
            //char ('1') -> string ("1") -> int (1)
            //атака
            if(currentSymbol=='>')
            {
                int attackStrength=Integer.parseInt(text.charAt(position+1)+"");
                totalStrength+=attackStrength;
            }else if(currentSymbol!='>' && totalStrength>0)
            {
                text.deleteCharAt(position);
                totalStrength--;
                position--;
            }
        }
        System.out.println(text);
    }
}
