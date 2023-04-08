import java.util.Scanner;

public class SwimmingWorldRecord {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double recordInSec=Double.parseDouble(scanner.nextLine());
        double meters=Double.parseDouble(scanner.nextLine());
        double secForMeter=Double.parseDouble(scanner.nextLine());

        double haveTo=meters*secForMeter;

        double resistence=Math.floor(meters/15)*12.5;

        double totalTime=haveTo+resistence;

        if(totalTime>=recordInSec){
            double needsec=totalTime-recordInSec;
            System.out.printf("No, he failed! He was %.2f seconds slower.",needsec);

        }else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }

    }
}
