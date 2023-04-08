package TextProcessingMoreExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] keys= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String input= scanner.nextLine();
        while(!input.equals("find"))
        {
            String message=decryptMessage(input,keys);
            Pattern pattern=Pattern.compile("^.*&(?<type>.+)&.*<(?<coordinates>.+)>$");
            Matcher matcher=pattern.matcher(message);
            if (matcher.matches())
            {
                String type=matcher.group("type");
                String coordinates=matcher.group("coordinates");
                System.out.printf("Found %s at %s%n",type,coordinates);
            }
;            input= scanner.nextLine();
        }

    }
    private static String decryptMessage(String encryptedMessage,int[] keys)
    {
        char[] chars=new char[encryptedMessage.length()];
        encryptedMessage.getChars(0,encryptedMessage.length(),chars,0);
        int keysIndex=0;
        for(int charsIndex=0;charsIndex<chars.length;charsIndex++)
        {
            if(keysIndex>=keys.length)
            {
                keysIndex=0;
            }
            chars[charsIndex]-=keys[keysIndex++];
        }
        return String.valueOf(chars);
    }
}
