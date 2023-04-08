import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int videocarts=Integer.parseInt(scanner.nextLine());
        int processors=Integer.parseInt(scanner.nextLine());
        int ramMemory=Integer.parseInt(scanner.nextLine());

        double sumForVideocarts=videocarts*250;

        double processorPrice=0.35*sumForVideocarts;
        double sumForProcessors=processors*processorPrice;

        double priceForRAM=0.10*sumForVideocarts;
        double sumForRAM=priceForRAM*ramMemory;

        double totalSum=sumForVideocarts+sumForProcessors+sumForRAM;

        if(videocarts>processors){
            totalSum=totalSum-0.15*totalSum;
        }
        if(budget>=totalSum){
            System.out.printf("You have %.2f leva left!",budget-totalSum);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!",totalSum-budget);
        }

    }
}
