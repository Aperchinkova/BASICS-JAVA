import java.util.Scanner;

public class fruitShop2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String fruit=scanner.nextLine();
        String day=scanner.nextLine();
        double quantity=Double.parseDouble(scanner.nextLine());

        double totalprice=0.0;

        switch(day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch(fruit){
                    case "banana":
                        totalprice=quantity*2.50;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "apple":
                        totalprice=quantity*1.20;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "orange":
                        totalprice=quantity*0.85;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "grapefruit":
                        totalprice=quantity*1.45;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "kiwi":
                        totalprice=quantity*2.70;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "pineapple":
                        totalprice=quantity*5.50;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "grapes":
                        totalprice=quantity*3.85;
                        System.out.printf("%.2f",totalprice);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
            case "banana":
                switch(fruit){
                    case "banana":
                        totalprice=quantity*2.70;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "apple":
                        totalprice=quantity*1.25;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "orange":
                        totalprice=quantity*0.90;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "grapefruit":
                        totalprice=quantity*1.60;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "kiwi":
                        totalprice=quantity*3.00;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "pineapple":
                        totalprice=quantity*5.60;
                        System.out.printf("%.2f",totalprice);
                        break;
                    case "grapes":
                        totalprice=quantity*4.20;
                        System.out.printf("%.2f",totalprice);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
        default:
            System.out.println("error");
            break;
        }
    }
}
