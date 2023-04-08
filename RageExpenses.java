package exerciseBasicSyntax;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lostGamesCount=Integer.parseInt(scanner.nextLine());
        double headsetPrice=Double.parseDouble(scanner.nextLine());
        double mousePrice=Double.parseDouble(scanner.nextLine());
        double keyboardPrice=Double.parseDouble(scanner.nextLine());
        double displayPrice=Double.parseDouble(scanner.nextLine());

        int lostheadset=lostGamesCount/2;
        int lostmouse=lostGamesCount/3;
        int lostkeyboard=lostGamesCount/6;
        int lostdisplay=lostGamesCount/12;

        double totalSum=(lostheadset*headsetPrice)+(mousePrice*lostmouse)+(keyboardPrice*lostkeyboard)+(lostdisplay*displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
