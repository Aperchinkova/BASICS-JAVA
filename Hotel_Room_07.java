import java.util.Scanner;

public class Hotel_Room_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        if (month.equals("May") || month.equals("October")){
            studioPrice = nights * 50;
            apartmentPrice = nights * 65;
            if(nights > 7 && nights <= 14){
                double discount = studioPrice * 0.05;
                studioPrice = studioPrice - discount;
            } else if (nights > 14){
                double discount = studioPrice * 0.30;
                studioPrice = studioPrice - discount;
                double discount1 = apartmentPrice * 0.10;
                apartmentPrice = apartmentPrice - discount1;
            }
        }else if (month.equals("June") || month.equals("September")){
            studioPrice = nights * 75.20;
            apartmentPrice = nights * 68.70;
            if (nights > 14){
                double discount = studioPrice * 0.20;
                studioPrice = studioPrice - discount;
                double discount1 = apartmentPrice * 0.10;
                apartmentPrice = apartmentPrice - discount1;
            }
        }else if (month.equals("July") || month.equals("August")){
            studioPrice = nights * 76;
            apartmentPrice = nights * 77;
            if (nights > 14){
                double discount1 = apartmentPrice * 0.10;
                apartmentPrice = apartmentPrice - discount1;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
