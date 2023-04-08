import java.util.Scanner;

public class onTimeForexam2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int examHour=Integer.parseInt(scanner.nextLine());
        int examMin=Integer.parseInt(scanner.nextLine());
        int hourOfArrival=Integer.parseInt(scanner.nextLine());
        int minOfArrival=Integer.parseInt(scanner.nextLine());

        int examAllmin=examHour*60+examMin;
        int arrivalAllMin=hourOfArrival*60+minOfArrival;

        int diff=Math.abs(examAllmin-arrivalAllMin);
        int hour=diff/60;
        int min=diff%60;
        if(examAllmin<arrivalAllMin){
            System.out.println("Late");
            if(diff<=59){
            System.out.printf("%d minutes after the start",diff);}
            else{
                System.out.printf("%d:%02d hours after the start",hour,min);
            }
        }else if(examAllmin==arrivalAllMin || diff<=30){
            System.out.println("On time");
            if(diff!=0){
                System.out.printf("%d minutes before the start",diff);
            }
        }else{
            System.out.println("Early");
            if(diff<=59){
                System.out.printf("%02d minutes before the start",diff);
            }else{
                System.out.printf("%d:%02d hours before the start",hour,min);
            }
        }
     }
}
