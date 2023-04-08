import java.util.Scanner;

public class localShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String product=scanner.nextLine();
        String town=scanner.nextLine();
        double quantity=Double.parseDouble(scanner.nextLine());
        double price=0.0;

        if(product=="coffee"){
            if(town=="Sofia"){
                price=quantity*0.50;
                System.out.printf("%.1f",price);
            }else if(town=="Plovdiv"){
                price=quantity*0.40;
                System.out.printf("%.1f",price);
            }else if(town=="Varna") {
                price = quantity * 0.40;
                System.out.printf("%.1f", price);
            }
        }else if(product=="water"){
            if(town=="Sofia"){
                price=quantity*0.80;
                System.out.printf("%.1f",price);
            }else if(town=="Plovdiv"){
                price=quantity*0.70;
                System.out.printf("%.1f",price);
            }else if(town=="Varna"){
                price=quantity*0.70;
                System.out.printf("%.1f",price);
            }
        }
    }
}
