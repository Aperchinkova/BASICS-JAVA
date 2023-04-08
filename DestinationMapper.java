package ExamPreparation30July;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String places= scanner.nextLine();
        Pattern pattern=Pattern.compile("([=|\\/])(?<destinations>[A-Z][A-Za-z]{2,}+)\\1");
        Matcher matcher=pattern.matcher(places);
        List<String> destinations=new ArrayList<>();
        int travelPoints=0;
        while(matcher.find())
        {
            destinations.add(matcher.group("destinations"));
            travelPoints+=matcher.group("destinations").length();
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinations));
        System.out.printf("Travel Points: %d%n", travelPoints);
    }
}
