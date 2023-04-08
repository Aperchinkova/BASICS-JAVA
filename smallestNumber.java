package methods;

import java.util.Scanner;

public class smallestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());
        smallest(num1,num2,num3);
    }
    public static void smallest(int n1,int n2,int n3)
    {
        if(n1<=n2 && n1<=n3)
        {
            System.out.println(n1);
        }else if(n2<=n1 && n2<=n3)
        {
            System.out.println(n2);
        }else if(n3<=n1 && n3<=n2)
        {
            System.out.println(n3);
        }
    }
}
