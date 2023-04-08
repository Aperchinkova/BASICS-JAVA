package LabTextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] bannedWords=scanner.nextLine().split(", ");
        String text= scanner.nextLine();
        /*
        for(int i=0;i<bannedWords.length;i++)
        {
            String currentWord=bannedWords[i];
            int len=currentWord.length();
            text=text.replace(bannedWords[i],stars(currentWord,len));
        }

         */
        for (String banWord:bannedWords)
        {
            if(text.contains(banWord))
            {
                text=text.replace(banWord,stars("*",banWord.length()));
            }
        }
        System.out.println(text);
    }
    /*
    public static String stars(String word,int count)
    {
        String result="";
        for(int i=0;i<count;i++)
        {
            result+='*';
        }
        return result;
    }

     */
    public static String stars(String s,int count)
    {
        String result="";
        for(int i=0;i<count;i++)
        {
            result+=s;
        }
        return result;
    }
}
