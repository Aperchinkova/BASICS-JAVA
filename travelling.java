import java.util.Scanner;

public class travelling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String destination=scanner.nextLine();
        while(!destination.equals("End")){
            double neededMoney=Double.parseDouble(scanner.nextLine());
            double sum=0;
            while(sum<neededMoney){
                double currentMoney=Double.parseDouble(scanner.nextLine());
                sum+=currentMoney;
            }
            System.out.printf("Going to %s!%n",destination);
            destination=scanner.nextLine();
        }
    }
}
