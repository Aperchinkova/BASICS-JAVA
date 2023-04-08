import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String username=scanner.nextLine();
        String password=scanner.nextLine();

        String inputpassword=scanner.nextLine();

        while(!inputpassword.equals(password)){
            inputpassword=scanner.nextLine();
        }
        System.out.println("Welcome "+username+"!");
    }
}
