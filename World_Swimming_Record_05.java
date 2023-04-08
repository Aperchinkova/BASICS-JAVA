import java.util.Scanner;

public class World_Swimming_Record_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double secRecord = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double secPerMetre = Double.parseDouble(scanner.nextLine());

        double timeSec = metres * secPerMetre;

        double slowMetres = Math.floor(metres/15);
        double slowSec = slowMetres * 12.5;

        double totalTime = timeSec + slowSec;

        if (totalTime >= secRecord){
            double needSec = totalTime - secRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", needSec);
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
