package exerciseBasicSyntax;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double money=Double.parseDouble(scanner.nextLine());
        int countOfStudents=Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers=Double.parseDouble(scanner.nextLine());
        double priceOfRobes=Double.parseDouble(scanner.nextLine());
        double priceOfBelts=Double.parseDouble(scanner.nextLine());

        double sabres=Math.ceil(countOfStudents+0.10*countOfStudents)*priceOfLightsabers;
        double robes=priceOfRobes*countOfStudents;
        double belts=(countOfStudents-countOfStudents/6)*priceOfBelts;
        double total=sabres+robes+belts;
        if(total<=money)
        {
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        }
        else
        {
            System.out.printf("George Lucas will need %.2flv more.",total-money);
        }
    }
}
