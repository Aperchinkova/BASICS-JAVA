import java.util.Scanner;

public class comissions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String town=scanner.nextLine();
        double s=Double.parseDouble(scanner.nextLine());

        if(town=="Sofia"){
            if(s>=0 && s<=500){
                double comissions=5/100*s;
                System.out.printf("%.2f",comissions);
            }else if(s>500 && s<=1000){
                double comissions=7/100*s;
                System.out.printf("%.2f",comissions);
            }else if(s>1000 && s<=10000){
                double comissions=8/100*s;
                System.out.printf("%.2f",comissions);
            }else if(s>10000){
                double comissions=12/100*s;
                System.out.printf("%.2f",comissions);
            }
        }else if(town=="Varna"){
            if(s>=0 && s<=500){
                double comissions=4.5/100*s;
                System.out.printf("%.2f",comissions);
            }else if(s>500 && s<=1000){
                double comissions=7.5/100*s;
                System.out.printf("%.2f",comissions);
            }else if(s>1000 && s<=10000){
                double comissions=10/100*s;
                System.out.printf("%.2f",comissions);
            }else if(s>10000){
                double comissions=13/100*s;
                System.out.printf("%.2f",comissions);
            }
        }else if(town=="Plovdiv") {
            if (s >= 0 && s <= 500) {
                double comissions = 5.5 / 100*s;
                System.out.printf("%.2f", comissions);
            } else if (s > 500 && s <= 1000) {
                double comissions = 8 / 100*s;
                System.out.printf("%.2f", comissions);
            } else if (s > 1000 && s <= 10000) {
                double comissions = 12 / 100*s;
                System.out.printf("%.2f", comissions);
            } else if (s > 10000) {
                double comissions = 14.5 / 100*s;
                System.out.printf("%.2f", comissions);
            }
        }else{
            System.out.println("error");
//        }
        }

    }
}
