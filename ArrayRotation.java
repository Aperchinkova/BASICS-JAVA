package excArrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] array=scanner.nextLine().split(" ");
        int n=Integer.parseInt(scanner.nextLine());
        for(int rotations=1;rotations<=n;rotations++)
        {
                String firstNumber=array[0];
                for(int index=0;index< array.length-1;index++)
                {
                    array[index]=array[index+1];
                }
                array[array.length-1]=firstNumber;
        }
        for (String el:array) {
            System.out.print(el+" ");
        }

    }
}
