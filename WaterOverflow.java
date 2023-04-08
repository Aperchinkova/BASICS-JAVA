package exerciseDataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int capacity=255;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int q=Integer.parseInt(scanner.nextLine());
            sum+=q;
            if(sum>capacity)
            {
                System.out.println("Insufficient capacity!");
                sum-=q;
            }
        }
        System.out.println(sum);
    }
}
