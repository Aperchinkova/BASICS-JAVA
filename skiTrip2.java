import java.util.Scanner;

public class skiTrip2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int days=Integer.parseInt(scanner.nextLine());
        String accommodation=scanner.nextLine();
        String feedback=scanner.nextLine();

        int nights=days-1;
        double discount=0.0;
        double pricePerNight=0.0;

        switch(accommodation){
            case "room for one person":
                pricePerNight=18.00;
                break;
            case "apartment":
                pricePerNight=25.00;
                if(nights<10){
                    discount=0.3;
                }else if(nights<=15){
                    discount=0.35;
                }else{
                    discount=0.5;
                }
                break;
            case "president apartment":
                pricePerNight=35.00;
                if(nights<10){
                    discount=0.1;
                }else if(nights<=15){
                    discount=0.15;
                }else{
                    discount=0.2;
                }
                break;
        }
        double totalPrice=nights*pricePerNight;
        totalPrice=totalPrice-discount*totalPrice;

        switch(feedback){
            case "positive":
                totalPrice*=1.25;
                break;
            case "negative":
                totalPrice*=0.90;
                break;
        }
        System.out.printf("%.2f",totalPrice);


    }
}
