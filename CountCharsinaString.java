package exrAssocoativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word= scanner.nextLine();
        Map<Character,Integer> characterCount=new LinkedHashMap<>();
        for (char symbol:word.toCharArray()) {
            if(symbol == ' ')
            {
                continue;
            }
            if (!characterCount.containsKey(symbol))
            {
                characterCount.put(symbol,1);
            }else
            {
                int currentCount=characterCount.get(symbol);
                characterCount.put(symbol,currentCount+1);
            }
        }
        /*
        for (Map.Entry<Character, Integer> characterIntegerEntry : characterCount.entrySet()) {
            System.out.printf("%c -> %d%n",characterIntegerEntry.getKey(),characterIntegerEntry.getValue());
        }
         */
        characterCount.entrySet()
                .forEach(characterIntegerEntry -> System.out.println(characterIntegerEntry.getKey()+" -> "+characterIntegerEntry.getValue()));

    }
}
