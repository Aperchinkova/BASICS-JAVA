package DataTypesandVariablesLab;

import java.util.Scanner;

public class metersToKm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=Integer.parseInt(scanner.nextLine());
        double km=m*1.0/1000;
        System.out.printf("%.2f",km);
    }
}
