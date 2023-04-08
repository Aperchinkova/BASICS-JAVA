package TextProcessingMoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Pattern patternName=Pattern.compile("@(?<name>[A-Za-z]+)\\|");
        Pattern patternAge=Pattern.compile("#(?<age>[\\d]+)[\\*]");
        for(int i=0;i<n;i++)
        {
            String text= scanner.nextLine();
            Matcher name=patternName.matcher(text);
            Matcher age=patternAge.matcher(text);
            if(name.find())
            {
                if(age.find()){
                    System.out.println(name.group("name")+" is "+age.group("age")+" years old.");
                }
            }
        }
    }
}
