package exerciseDataTypesAndVariables;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int startingYield=Integer.parseInt(scanner.nextLine());
        int days=0;
        int totalAmountSpices=0;
        while(startingYield>=100)
        {
            int spices=startingYield-26;
            totalAmountSpices+=spices;
            days++;
            startingYield-=10;
        }
        System.out.println(days);
        if(totalAmountSpices>=26)
        {
            totalAmountSpices-=26;
        }
        System.out.println(totalAmountSpices);

    }
}
