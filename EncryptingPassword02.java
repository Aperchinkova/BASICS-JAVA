package EXAM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncryptingPassword02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        Pattern pattern=Pattern.compile("(?<symbols>[\\W|\\w|.*]+)>(?<firstgroup>[0-9]{3})[|](?<secondgroup>[a-z]{3})[|](?<thirdgroup>[A-Z]{3})[|](?<fourthgroup>[^<>]{3})<(\\1)");

        for(int i=0;i<n;i++)
        {
            String input=scanner.nextLine();
            Matcher matcher=pattern.matcher(input);


            if(matcher.find()){
                    String conc="";
                    String nums= matcher.group("firstgroup");
                    String lowerletters= matcher.group("secondgroup");
                    String capitals= matcher.group("thirdgroup");
                    String symbols= matcher.group("fourthgroup");
                    conc=conc.concat(nums).concat(lowerletters).concat(capitals).concat(symbols);
                    System.out.printf("Password: %s%n",conc);


            }else{
                System.out.println("Try another password!");
            }


        }
    }
}
