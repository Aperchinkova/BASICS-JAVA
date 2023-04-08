import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double excPrice=Double.parseDouble(scanner.nextLine());
        int puzzles=Integer.parseInt(scanner.nextLine());
        int talkingDolls=Integer.parseInt(scanner.nextLine());
        int teddyBears=Integer.parseInt(scanner.nextLine());
        int minion=Integer.parseInt(scanner.nextLine());
        int trucks=Integer.parseInt(scanner.nextLine());

        int toysCount=puzzles+talkingDolls+teddyBears+minion+trucks;
        double totalProfit=puzzles*2.60+talkingDolls*3.00+teddyBears*4.10+minion*8.20+trucks*2.00;

        if (toysCount>=50) {
            totalProfit=totalProfit-totalProfit*0.25;
        }
        totalProfit=totalProfit-totalProfit*0.10;

        if(totalProfit>=excPrice){
            System.out.printf("Yes! %.2f lv left.",totalProfit-excPrice);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",excPrice-totalProfit);
        }

    }
}
