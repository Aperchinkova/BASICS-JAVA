import java.util.Scanner;

public class localShop2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String product=scanner.nextLine();
        String town=scanner.nextLine();
        double quantity=Double.parseDouble(scanner.nextLine());
        double price=0;

        switch(product) {
            case "coffee":
                if (town.equals("Sofia")) {
                    price = quantity * 0.50;
                } else if (town.equals("Plovdiv")) {
                    price = quantity * 0.40;
                } else if (town.equals("Varna")) {
                    price = quantity * 0.45;
                }
                break;
            case "water":
                if (town.equals("Sofia")) {
                    price = quantity * 0.80;
                } else if (town.equals("Plovdiv")) {
                    price = quantity * 0.70;
                } else if (town.equals("Varna")) {
                    price = quantity * 0.70;
                }
                break;
            case "beer":
                if (town.equals("Sofia")) {
                    price = quantity * 1.20;
                } else if (town.equals("Plovidv")) {
                    price = quantity * 1.15;
                } else if (town.equals("Varna")) {
                    price = quantity * 1.10;
                }
                break;
            case "sweets":
                if (town.equals("Sofia")) {
                    price = quantity * 1.45;
                } else if (town.equals("Plovdiv")) {
                    price = quantity * 1.30;
                } else if (town.equals("Varna")) {
                    price = quantity * 1.35;
                }
                break;
            case "peanuts":
                if (town.equals("Sofia")) {
                    price = quantity * 1.60;
                } else if (town.equals("Plovdiv")) {
                    price = quantity * 1.50;
                } else if (town.equals("Varna")){
                    price=quantity*1.55;
                }
                break;
        }
        System.out.println(price);

        }
    }

