package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        //1. намираме две думи, които образуват двойка
        Pattern pattern =Pattern.compile("(@|#)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1");
        Matcher matcher=pattern.matcher(text);
        int countPairs=0;
        List<String> pairs=new ArrayList<>();
        //matcher = ["#poOl##loOp#", "#Part##traP#", ...]
        while (matcher.find()){
            String firstWord= matcher.group("first");
            String secondWord= matcher.group("second");
            countPairs++;
            //2. проверка дали думите са печеливши
            StringBuilder secondWordBuilder=new StringBuilder(secondWord);
            String reverseSecondWord=secondWordBuilder.reverse().toString();
            if(firstWord.equals(reverseSecondWord))
            {
                pairs.add(firstWord+" <=> "+secondWord);
            }
        }
        //отпечатваме брой на намерените двойки
        if(countPairs==0)
        {
            System.out.println("No word pairs found!");
        }else{
            System.out.println(countPairs+" word pairs found!");
        }
        // отпечатваме само валидните двойки
        if(pairs.size()==0)
        {
            System.out.println("No mirror words!");
        }else{
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ",pairs));
        }

    }
}
