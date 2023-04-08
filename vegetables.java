import java.util.Scanner;

public class vegetables {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double vegkg=Double.parseDouble(scanner.nextLine());
        double fruitskg=Double.parseDouble(scanner.nextLine());
        int totalkgveg=Integer.parseInt(scanner.nextLine());
        int totalkgFruits=Integer.parseInt(scanner.nextLine());
        double priceveg=vegkg*totalkgveg;
        double pricefruits=fruitskg*totalkgFruits;
        double total=(priceveg+pricefruits);
        double intoEuro=total/1.94;
        System.out.printf("%.2f",intoEuro);

    }
}
