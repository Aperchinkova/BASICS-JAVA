package excArrays;

import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[] wagons=new int[n];
        for(int wagon=0;wagon<n;wagon++)
        {
            int countOfPeople=Integer.parseInt(scanner.nextLine());
            wagons[wagon]=countOfPeople;
        }
        int sum=0;
        for (int number:wagons) {
            System.out.print(number+" ");
            sum+=number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
