package MidExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        double totalPriceWithoutTax=0;

        while(!input.equals("special")&& !input.equals("regular"))
        {
            Double price=Double.parseDouble(scanner.nextLine());
            if(price<0)
            {
                System.out.println("Invalid price!");
                input= scanner.nextLine();
                continue;
            }
            totalPriceWithoutTax+=price;
            input=scanner.nextLine();

        }
        if(totalPriceWithoutTax==0)
        {
            System.out.println("Invalid order!");
        }else
        {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$",totalPriceWithoutTax);
            double taxes=0.20*totalPriceWithoutTax;
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            double sumWithTaxes=totalPriceWithoutTax+taxes;
            if(input.equals("special"))
            {
                sumWithTaxes=sumWithTaxes*0.90;
            }
            System.out.printf("Total price: %.2f$%n",sumWithTaxes);
        }
    }
}
