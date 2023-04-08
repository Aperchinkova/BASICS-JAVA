import java.util.Scanner;

public class cinema2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String projection=scanner.nextLine();
        int rows=Integer.parseInt(scanner.nextLine());
        int columns=Integer.parseInt(scanner.nextLine());
        int totalPlaces=rows*columns;
        double income=0.0;

        switch(projection){
            case "Premiere":
                income=totalPlaces*12.00;
                break;
            case "Normal":
                income=totalPlaces*7.50;
                break;
            case "Discount":
                income=totalPlaces*5.00;
                break;
        }
        System.out.printf("%.2f leva",income);


    }
}
