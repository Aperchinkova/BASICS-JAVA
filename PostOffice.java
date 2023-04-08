package RegularExpressionsMoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] message= scanner.nextLine().split("\\|");
        String firstPart=message[0];
        String secondPart=message[1];
        String thirdPart=message[2];
        Map<Character,Integer> letters=new LinkedHashMap<>();
       // Pattern patternText=Pattern.compile("(?<symbols>[#|$|%|*|&])(?<letters>[A-Z]{1,})(\\1)");//for the first Part
        Pattern patternText=Pattern.compile("([#$%*&])([A-Z]+)\\1");
        Matcher matcherText=patternText.matcher(firstPart);
        String capitalLetters="";
        while (matcherText.find())
        {
            String current=matcherText.group();//$AOTP$|
            capitalLetters=current.substring(1,current.length()-1);//AOTP
        }
        for (int i=0;i<capitalLetters.length();i++)
        {
            char symbol=capitalLetters.charAt(i);//A  B  C  D
            Pattern patternDigits=Pattern.compile("([0-9]{2}):([0-9]{2})");
            Matcher matcherDigits=patternDigits.matcher(secondPart);//matchvame vtorata chast za cifri in style 56:03 primerno

            while (matcherDigits.find())
            {
                String current=matcherDigits.group();
                String[] digits=current.split(":");//67:05
                int asciiCode=Integer.parseInt(digits[0]);//67
                int length=Integer.parseInt(digits[1]);//5
                if(symbol==asciiCode && !letters.containsKey(symbol))
                {
                    letters.put(symbol,length+1);
                    break;
                }
            }
        }
        String[] thirdText=thirdPart.split("\\s+");
        for(int i=0;i<capitalLetters.length();i++)
        {
            char firstLetter=capitalLetters.charAt(i);//A
            int length=letters.get(firstLetter);//5
            for (String word: thirdText)
            {
                int lengthWord=word.length();
                String wordFirstChar=word.substring(0,1);
                char firstChar=wordFirstChar.charAt(0);
                if(lengthWord==length && firstLetter==firstChar)
                {
                    System.out.println(word);
                }
            }
        }
    }
}
