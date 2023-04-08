import java.util.Scanner;

public class GodsillaAgainstKong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        int numOfStatists=Integer.parseInt(scanner.nextLine());
        double priceOfClothingForOneStatist=Double.parseDouble(scanner.nextLine());

        double sumForDecor=0.10*budget;
        double sumForClothing=numOfStatists*priceOfClothingForOneStatist;

        if(numOfStatists>150){
            sumForClothing=sumForClothing-sumForClothing*0.1;
        }
        double totalSum=sumForDecor+sumForClothing;
        if (budget>=totalSum){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-totalSum);
        }else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(budget-totalSum));
        }

    }
}
