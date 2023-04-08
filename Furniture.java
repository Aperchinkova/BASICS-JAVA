package RegularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        Pattern pattern=Pattern.compile(">>(?<furniture>\\w+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)");

        double totalSum=0;
        List<String> furnitureList=new ArrayList<>();
        while(!text.equals("Purchase"))
        {
            Matcher matcher=pattern.matcher(text);
            while (matcher.find())
            {
                String furniture= matcher.group("furniture");
                double price= Double.parseDouble(matcher.group("price"));
                int quantity=Integer.parseInt(matcher.group("quantity"));
                furnitureList.add(furniture);
                double currentFurniturePrice=price*quantity;
                totalSum+=currentFurniturePrice;
            }
            text= scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalSum);
    }
}
