import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double priceSkumriq=Double.parseDouble(scanner.nextLine());
        double priceCaca=Double.parseDouble(scanner.nextLine());
        double kgPalamud=Double.parseDouble(scanner.nextLine());
        double kgSafrid=Double.parseDouble(scanner.nextLine());
        int kgMidi=Integer.parseInt(scanner.nextLine());


        double pricePalamud=priceSkumriq+0.60*priceSkumriq;
        double sumPalamud=kgPalamud*pricePalamud;

        double priceSafrid=priceCaca+0.80*priceCaca;
        double sumSafrid=kgSafrid*priceSafrid;

        double sumMidi=7.50*kgMidi;
        double total=sumPalamud+sumMidi+sumSafrid;
        System.out.printf("%.2f",total);



    }
}
