package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        int[] numbersArr= Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum=0;
        for(int i=0;i< numbersArr.length;i++)
        {
            int currentNumber=numbersArr[i];
            if(currentNumber%2==0)
            {
                sum+=currentNumber;
            }
        }
        System.out.println(sum);
    }
}
