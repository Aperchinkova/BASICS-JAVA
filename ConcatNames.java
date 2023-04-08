package DataTypesandVariablesLab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String first=scanner.nextLine();
        String last=scanner.nextLine();
        String c=scanner.nextLine();

        System.out.printf(first+c+last);
    }
}
