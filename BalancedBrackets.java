package DataTypesAndVariablesMoreExcercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int openCount=0;
        int closeCount=0;
        for(int i=1;i<=n;i++)
        {
            String input= scanner.nextLine();
            if(input.equals("("))
            {
                openCount++;
            }else if(input.equals(")"))
            {
                closeCount++;
                if(openCount-closeCount!=0)
                {
                    System.out.println("UNBALANCED");
                    return;
                }
            }
        }
        if(openCount==closeCount)
        {
            System.out.println("BALANCED");
        }else
        {
            System.out.println("UNBALANCED");
        }
    }
}
