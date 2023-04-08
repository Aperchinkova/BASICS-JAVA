package RegularExpressionsExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        Pattern pattern=Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>[\\w]+)>[^|$%.]*[|](?<count>\\d+)[|][^|$%.]*?(?<price>\\d+[.]*\\d+)[$]");
        double totalPrice=0;
        Map<String,Double> map=new LinkedHashMap<>();
        while(!input.equals("end of shift"))
        {
            Matcher matcher=pattern.matcher(input);
            while(matcher.find())
            {
                String name= matcher.group("name");
                String product= matcher.group("product");
                String whole=name+": "+product;

                int count=Integer.parseInt(matcher.group("count"));
                double price=Double.parseDouble(matcher.group("price"));
                double currentPrice=count*price;
                map.put(whole,currentPrice);
                totalPrice+=currentPrice;
            }
            input= scanner.nextLine();
        }
        //George: Croissant - 20.60
        //Peter: Gum - 1.30
        //Maria: Cola - 2.40
        //Total income: 24.30
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            String product= entry.getKey();
            double price=entry.getValue();
            System.out.printf("%s - %.2f%n",product,price);
           // System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        System.out.printf("Total income: %.2f",totalPrice);

    }
}
