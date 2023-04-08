import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String projections=scanner.nextLine();
        int rows=Integer.parseInt(scanner.nextLine());
        int columns=Integer.parseInt(scanner.nextLine());
        double totalSumForFullHall=0.0;
        switch(projections){
            case "Premiere":
            if(projections.equals("Premiere")){
                totalSumForFullHall=rows*columns*12.00;
                System.out.printf("%.2f leva",totalSumForFullHall);
            }
            break;
            case "Normal":
                if(projections.equals("Normal")){
                    totalSumForFullHall=rows*columns*7.50;
                    System.out.printf("%.2f leva",totalSumForFullHall);
                }
            break;
            case "Discount":
                if(projections.equals("Discount")){
                    totalSumForFullHall=rows*columns*5.00;
                    System.out.printf("%.2f leva",totalSumForFullHall);
                }
        }
    }
}
