package FINALEXAMSPREP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        Pattern pattern=Pattern.compile("(?<symbols>[#\\|])(?<food>[A-za-z\\s]+)(\\1)(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})(\\1)(?<calories>[\\d]{1,5})(\\1)");
        Matcher matcher=pattern.matcher(text);
        List<String> foods=new ArrayList<>();
        int total=0;
        while (matcher.find())
        {

            total+=Integer.parseInt(matcher.group("calories"));
            foods.add(String.format("Item: %s, Best before: %s, Nutrition: %s%n",matcher.group("food"),matcher.group("date"),matcher.group("calories")));
        }
        System.out.printf("You have food to last you for: %d days!%n",total/2000);
        foods.forEach(System.out::print);
    }
}
