import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String type=scanner.nextLine();
        switch(type){
            case "sunny":
                System.out.println("It's warm outside!");
                break;
            default:
                System.out.println("It's cold outside!");
                break;
        }
    }
}
