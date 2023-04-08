import java.util.Scanner;

public class Time_Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int hoursToSec = hours*60;
        int time = min+hoursToSec + 15;

        int newHour = time / 60;
        int newMin = time%60;

        if (newHour == 24){
            newHour=0;
        }

        System.out.printf("%d:%02d",newHour, newMin);
    }
}
