package exerciseDataTypesAndVariables;

import java.util.Scanner;

public class integerOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());
        int d=Integer.parseInt(scanner.nextLine());
        int ab=a+b;
        int abc=ab/c;
        int abcd=abc*d;
        System.out.println(abcd);
    }
}
