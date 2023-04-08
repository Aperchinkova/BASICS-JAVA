package ExamPreparation30July;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        Pattern pattern=Pattern.compile("(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))");
        Pattern digits=Pattern.compile("\\d");
        Matcher digit=digits.matcher(text);
        Matcher matcher=pattern.matcher(text);
        List<String> cool=new ArrayList<>();

        int coolness2=1;
        int validEmojis=0;

        while(digit.find()){
            int digitt=Integer.parseInt(digit.group(0));
            coolness2*=digitt;
        }
        while (matcher.find())
        {
            int coolness1=0;
            validEmojis++;
            String name=matcher.group("name");
            int len= name.length();
            for(int i=2;i<len-2;i++)
            {

                char symbol=name.charAt(i);
                coolness1+=(int)symbol;

            }
            if(coolness1>coolness2)
            {
                cool.add(matcher.group("name"));
            }
        }
        System.out.println("Cool threshold: "+coolness2);
        System.out.println(validEmojis+" emojis found in the text. The cool ones are:");
        for (String a:cool) {
            System.out.printf("%s %n",a);
        }
    }
}
