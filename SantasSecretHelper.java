package RegularExpressionsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int key=Integer.parseInt(scanner.nextLine());
        String messages= scanner.nextLine();
       // StringBuilder sb=new StringBuilder();

        List<String> decrypted=new ArrayList<>();
        List<String> names=new ArrayList<>();
        while(!messages.equals("end"))
        {
            String sb="";
            for(int i=0;i<messages.length();i++)
            {

                char symbol=messages.charAt(i);
                int symbolInt=(int)symbol;
                int newSymbol=symbolInt-key;
                char newToChar=(char)newSymbol;
                sb+=newToChar;
            }
            decrypted.add(sb);
            messages= scanner.nextLine();
        }
        for(int i=0;i<decrypted.size();i++)
        {
            String mes=decrypted.get(i);//@Kate^jfdvbkrjgb!G!
            Pattern pattern=Pattern.compile("@(?<name>[A-Za-z]+)[^@\\-!:>]*!(?<behavior>[G])!");
            Matcher matcher=pattern.matcher(mes);
            while (matcher.find()){
                String name= matcher.group("name");
                String behavior= matcher.group("behavior");
                if(behavior.equals("G"))
                {
                    names.add(name);
                }
            }
        }
        for (String name:names)
        {
            System.out.println(name);
        }
    }
}
