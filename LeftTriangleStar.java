package JavaBasicProblems;

import java.util.Scanner;

public class LeftTriangleStar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i,j,row=6;
        for(i=0;i<row;i++)
        {
            for(j=2*(row-i);j>=0;j--)
            {
                System.out.print("");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
