package DataTypesAndVariablesMoreExcercise;

import java.util.Scanner;

public class leftToTheRight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++)
        {
            long sum=0;
            String currLine= scanner.nextLine();
            String[] splitLine=currLine.split(" ");
            long firstInt=Long.parseLong(splitLine[0]);
            long secondInt=Long.parseLong(splitLine[1]);
            if(firstInt>=secondInt)
            {
                firstInt=Math.abs(firstInt);
                while(firstInt>0)
                {
                    sum+=firstInt%10;
                    firstInt/=10;
                }
            }else
            {
                secondInt=Math.abs(secondInt);
                while (secondInt>0)
                {
                    sum+=secondInt%10;
                    secondInt/=10;
                }
            }
            System.out.println(sum);
        }

    }
}
