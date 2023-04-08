import java.util.Scanner;

public class celsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double c=Double.parseDouble(scanner.nextLine());
        double f=0;
        f=(c*9/5)+32;
        System.out.printf("%.2f",f);
    }
}
