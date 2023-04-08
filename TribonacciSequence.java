package MethodMoreExcercise;

import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int[] tribonacci=new int[Math.max(num,3)];
        Calculation(tribonacci);
        for (int i = 0; i < num; i++) {
            System.out.printf("%d",tribonacci[i]);
        }

    }
    private static void Calculation(int[] tribonacci)
    {
        tribonacci[0]=tribonacci[1]=1;
        tribonacci[2]=2;
    }
}
