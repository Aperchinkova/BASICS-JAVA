package RegularExpressionsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        Pattern pattern=Pattern.compile("(?<string>[\\D]*)(?<count>\\d+)");
        Matcher matcher=pattern.matcher(input);
        StringBuilder sb=new StringBuilder();
        while (matcher.find())//a3
        {
            int n=Integer.parseInt(matcher.group("count"));//3
            String word= matcher.group("string").toUpperCase();//A
            for(int i=0;i<n;i++)
            {
                sb.append(word);
            }
        }
        System.out.printf("Unique symbols used: %d%n",sb.chars().distinct().count());
        System.out.println(sb);
    }
}
