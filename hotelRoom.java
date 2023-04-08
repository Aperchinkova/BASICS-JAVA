import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String month=scanner.nextLine();
        int nights=Integer.parseInt(scanner.nextLine());
        double priceStudio=0.0;
        double priceApartment=0.0;
        double discount=0;

        if(month.equals("May")||month.equals("October")){
            priceStudio=50*nights;
            priceApartment=65*nights;
            if(nights>7 && nights<=14){
                discount=priceStudio*0.05;
                priceStudio=priceStudio-discount;
            }else if(nights>14){
                discount=priceStudio*0.30;
                priceStudio=priceStudio-discount;
                double discount1=priceApartment*0.1;
                priceApartment=priceApartment-discount1;
            }
        } else if (month.equals("June")||month.equals("September")){
            priceStudio=nights*75.20;
            priceApartment=nights*68.70;
            if(nights>14){
                discount=priceStudio*0.20;
                priceStudio=priceStudio-discount;
                double discount1=priceApartment*0.1;
                priceApartment=priceApartment-discount1;
            }
        }else if(month.equals("July")||month.equals("August")){
            priceStudio=nights*76;
            priceApartment=nights*77;
            if(nights>14){
                double discount1=priceApartment*0.10;
                priceApartment=priceApartment-discount1;
            }
        }
        System.out.printf("Apartment: %.2f lv.\n",priceApartment);
        System.out.printf("Studio: %.2f lv.",priceStudio);
        }
}
