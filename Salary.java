import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int fine = 0;
        for (int i = 1; i <= countTabs; i++) {
            String type = scanner.nextLine();
            if (type.equals("Facebook")) {
                fine = 150;
                salary -= fine;
            } else if (type.equals("Instagram")) {
                fine = 100;
                salary -= fine;
            } else if (type.equals("Reddit")) {
                fine = 50;
                salary -= fine;
            }

        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        }
        if(salary>0){
            System.out.printf("%d",salary);
        }

    }
}
