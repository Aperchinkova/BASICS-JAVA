import java.util.Scanner;

public class Shopping_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardSum = videoCard * 250.0;

        double processorPrice = videoCardSum * 0.35;
        double processorSum = processor * processorPrice;

        double ramPrice = videoCardSum * 0.10;
        double ramSum = ram * ramPrice;

        double totalSum = videoCardSum + processorSum + ramSum;

        if (videoCard > processor){
            double discount = totalSum * 0.15;
            totalSum = totalSum - discount;
        }

        if(totalSum <= budget){
          double leftMoney = budget - totalSum;
            System.out.printf("You have %.2f leva left!", leftMoney);

        }else{
             double needMoney = totalSum - budget;
            System.out.printf("Not enough money! You need %.2f leva more!",needMoney);
        }
    }

}
