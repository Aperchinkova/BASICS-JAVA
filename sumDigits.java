package exerciseDataTypesAndVariables;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        while(n>0)
        {
            int temp;
            temp=n%10;
            sum+=temp;
            n/=10;
        }
        System.out.println(sum);
    }
}
