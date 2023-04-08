import java.util.Scanner;

public class demoDays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String day=scanner.nextLine();
        if(day.equals("Monday")){
            System.out.printf("Today is %s",day);
        }else if(day.equals("Tuesday")){
            System.out.printf("Today is %s",day);
        }else{
            System.out.println("Invalid output");
        }
    }
}
