import java.util.Scanner;

public class onTimeForExam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int examHour=Integer.parseInt(scanner.nextLine());
        int minuteOfExam=Integer.parseInt(scanner.nextLine());
        int hourOfArrival=Integer.parseInt(scanner.nextLine());
        int minuteOfArrival=Integer.parseInt(scanner.nextLine());
//
//      “Late”, ако студентът пристига по-късно от часа на изпита.
//     “On time”, ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
//     “Early”, ако студентът пристига повече от 30 минути преди часа на изпита.

        int examTime=examHour*60+minuteOfExam;
        int arrivalTime=hourOfArrival*60+minuteOfArrival;
        String status="";
        String output="";

        if(arrivalTime<examTime-30){//Early
            status="Early";
            int diff=examTime-arrivalTime;
            if(diff<60){
                output=String.format("%d minutes before the start",diff);
            }else{
                int h=diff/60;
                int m=diff%60;
                output=String.format("%d:%02d hours before the start",h,m);
            }
        }else if(arrivalTime<=examTime){//On time
            status="On time";
            int diff=examTime-arrivalTime;
            output=String.format("%d minutes before the start",diff);

        }else{//Late
            status="Late";
            int diff=arrivalTime-examTime;
            if(diff<60){
                output=String.format("%d minutes after the start",diff);
            }else{
                int h=diff/60;
                int m=diff%60;
                output=String.format("%d:%02d hours after the start",h,m);
            }
        }
        System.out.println(status);
        System.out.println(output);

    }
}
