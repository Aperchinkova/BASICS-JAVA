import java.util.Scanner;

public class tradeCommissions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String city=scanner.nextLine();
        double sale=Double.parseDouble(scanner.nextLine());

        double commissions=0.0;
        String output="";
        if(sale>=0 && sale<=500){
            switch(city){
                case "Sofia":
                    commissions=0.05*sale;
                    break;
                case "Varna":
                    commissions=sale*0.045;
                    break;
                case "Plovdiv":
                    commissions=sale*0.055;
                    break;
            }
        }else if(sale<=1000){
            switch(city){
                case "Sofia":
                    commissions=sale*0.07;
                    break;
                case "Varna":
                    commissions=sale*0.075;
                    break;
                case "Plovdiv":
                    commissions=sale*0.08;
                    break;
            }
        }else if(sale<=10000){
            switch(city) {
                case "Sofia":
                    commissions = sale * 0.08;
                    break;
                case "Varna":
                    commissions = sale * 0.10;
                    break;
                case "Plovdiv":
                    commissions = sale * 0.12;
                    break;
            }
        }else if(sale>10000){
            switch(city){
                case "Sofia":
                    commissions = sale * 0.12;
                    break;
                case "Varna":
                    commissions = sale * 0.13;
                    break;
                case "Plovdiv":
                    commissions = sale * 0.145;
                    break;
            }
        }
        if ( (!city.equals("Sofia")) && (!city.equals("Plovdiv")) && (!city.equals("Varna")) && (sale < 0)) {
            System.out.println("error");
        }else if((city.equals("Sofia") || city.equals("Plovdiv") || city.equals("Varna")) && (sale < 0) ){
            System.out.println("error");
        }else  if((!city.equals("Sofia")) && (!city.equals("Plovdiv")) && (!city.equals("Varna")) && (sale >= 0)){
            System.out.println("error");
        }else {
            System.out.printf("%.2f",commissions);
        }
    }
}
