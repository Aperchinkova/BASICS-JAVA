import java.util.Scanner;

public class newHome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String flowers=scanner.nextLine();
        int numOfFlowers=Integer.parseInt(scanner.nextLine());
        int budget=Integer.parseInt(scanner.nextLine());
        double totalPrice=0.0;
        switch(flowers) {
            case "Roses":
                if (numOfFlowers > 80) {
                    totalPrice = totalPrice-10 / 100*totalPrice;
                }
            break;
            case "Dahlias":
                if (numOfFlowers > 90) {
                    totalPrice = totalPrice - 15 / 100*totalPrice;
                }
            break;
            case "Tulips":
                if (numOfFlowers > 80) {
                    totalPrice = totalPrice - 15 / 100*totalPrice;
                }
            break;
            case "Narcissus":
                if (numOfFlowers < 120) {
                    totalPrice = totalPrice + 15 / 100*totalPrice;
                }
            break;
            case "Gladiolus":
                if (numOfFlowers < 80) {
                    totalPrice = totalPrice + 20 / 100*totalPrice ;
                }
            break;
        }
        if(budget>totalPrice){
            double total=budget-totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numOfFlowers,flowers,total);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget-totalPrice));
        }
    }
}
