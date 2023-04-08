import java.util.Scanner;

public class Small_Shop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (item){
            case "coffee":
                if (city.equals("Sofia")){
                    price = quantity*0.50;
                }else if (city.equals("Plovdiv")){
                    price = quantity * 0.40;
                }else if(city.equals("Varna")) {
                    price = quantity * 0.45;
                }
                break;
            case "water":
                if (city.equals("Sofia")){
                    price = quantity*0.80;
                }else if (city.equals("Plovdiv")){
                    price = quantity * 0.70;
                }else if(city.equals("Varna")) {
                    price = quantity * 0.70;
                }
                break;
            case "beer":
                if (city.equals("Sofia")){
                    price = quantity*1.20;
                }else if (city.equals("Plovdiv")){
                    price = quantity * 1.15;
                }else if(city.equals("Varna")) {
                    price = quantity * 1.10;
                }
                break;
            case "sweets":
                if (city.equals("Sofia")){
                    price = quantity*1.45;
                }else if (city.equals("Plovdiv")){
                    price = quantity * 1.30;
                }else if(city.equals("Varna")) {
                    price = quantity * 1.35;
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")){
                    price = quantity*1.60;
                }else if (city.equals("Plovdiv")){
                    price = quantity * 1.50;
                }else if(city.equals("Varna")) {
                    price = quantity * 1.55;
                }
                break;
        }
        System.out.println(price);
    }

}
