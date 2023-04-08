package RegularExpressionsMoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        String[] parts=text.split("\\|");
        String firstPart=parts[0];
        String secondPart=parts[1];
        String thirdPart=parts[2];
        Pattern capletters=Pattern.compile("([#$%*&])([A-Z]+)(\\1)");
        Matcher matcher=capletters.matcher(firstPart);
        String capitalLetters="";
        Map<Character,Integer> letters=new LinkedHashMap<>();
        while (matcher.find()){
            String current= matcher.group();
            capitalLetters=current.substring(1,current.length()-1);
        }
        for(int i=0;i<capitalLetters.length();i++)
        {
            char symbol=capitalLetters.charAt(i);
            Pattern digits=Pattern.compile("([0-9]{2}):([0-9]{2})");
            Matcher digit=digits.matcher(secondPart);
            while (digit.find())
            {
                String currentDigit= digit.group();
                String[] dig=currentDigit.split(":");
                int ascii=Integer.parseInt(dig[0]);
                int len=Integer.parseInt(dig[1]);
                if(symbol==ascii && !letters.containsKey(symbol))
                {
                    letters.put(symbol,len+1);
                    break;
                }
            }
        }
        String[] thirdText=thirdPart.split("\\s+");
        for(int i=0;i<capitalLetters.length();i++)
        {
            char firstLetter=capitalLetters.charAt(i);
            for (String word:thirdText)
            {
                int wordLength=word.length();//9
                String firstLet=word.substring(0,1);//"a"
                char first=firstLet.charAt(0);//'a'
                if(firstLetter==first && letters.get(firstLetter)==wordLength)
                {
                    System.out.println(word);
                }
            }
        }
    }
}
