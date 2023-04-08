package DataTypesandVariablesLab;

import java.util.Scanner;

public class refactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int ch = 1; ch <= n; ch++) {

            int total = 0;

            int actualNum = 0;

            actualNum = ch;

            while (ch > 0) {
               total+=ch%10;
               ch=ch/10;
            }

            boolean trueFalse = (total == 5) || (total == 7) || (total == 11);
            String tf;
            if(trueFalse)
            {
                tf="True";
            }else
            {
                tf="False";
            }
            System.out.printf("%d -> %s%n", actualNum,tf);
            ch = actualNum;
    }
}
}
