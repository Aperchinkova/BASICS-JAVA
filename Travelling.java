import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();
        double spent=0.0;

        switch(season){
            case "summer":
                if(season.equals("summer")) {
                    if (budget <= 100) {
                        spent = 0.3 * budget;
                        System.out.println("Somewhere in Bulgaria");
                        System.out.printf("Camp – %.2f",spent);
                    }else if(budget<=1000){
                        spent = 0.4 * budget;
                        System.out.println("Somewhere in Balkans");
                        System.out.printf("Camp – %.2f",spent);
                    }else if(budget>1000){
                        spent = 0.9 * budget;
                        System.out.println("Somewhere in Europe");
                        System.out.printf("Hotel – %.2f",spent);
                    }
                }
                break;
            case "winter":
                if (budget <= 100) {
                    spent = 0.7 * budget;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel – %.2f",spent);
                }else if(budget<=1000){
                    spent = 0.8 * budget;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel – %.2f",spent);
                }else if(budget>1000){
                    spent = 0.9 * budget;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel – %.2f",spent);
                }
                break;

        }
    }
}
