package LabTextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] words=scanner.nextLine().split(" ");
        /*
        StringBuilder result=new StringBuilder();
        for(String word:words)
        {
            int count=word.length();
            for(int i=0;i<count;i++)
            {
                result.append(word);
            }
        }
        System.out.println(result);
         */
        List<String> repeatList=new ArrayList<>();
        for (int i=0;i<words.length;i++)
        {
            int len=words[i].length();
            String currentWord=words[i];
            String repeat=repeatStr(currentWord,len);
            repeatList.add(repeat);
        }
        System.out.println(String.join("",repeatList));
    }
    public static String repeatStr(String s,int count)
    {
        String result="";
        for (int i=0;i<count;i++)
        {
            result+=s;
        }
        return result;

    }
}
