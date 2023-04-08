import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int hour=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());

        int totaTime=hour*60+minutes+15;

        int newHour=totaTime/60;
        int newMinutes=totaTime%60;

        if(newHour==24){
            newHour=0;
        }
        System.out.printf("%d:%02d",newHour,newMinutes);



    }
}
