import java.util.Scanner;

public class doubledivision {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());
        double result=number*1.0/number2;
        System.out.println(result);
    }
}
