package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class equalSums {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers= Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound=false;

        for(int index=0;index<= numbers.length-1;index++)
        {
            int currentNumber=numbers[index];
            int leftsum=0;
            int rightsum=0;

            for(int leftindex=0;leftindex<index;leftindex++)
            {
                leftsum+=numbers[leftindex];
            }
            for(int rightindex=index+1;rightindex<=numbers.length-1;rightindex++)
            {
                rightsum+=numbers[rightindex];
            }
            if(leftsum==rightsum)
            {
                System.out.println(index);
                isFound=true;
                break;
            }
        }
        if(!isFound)
        {
            System.out.println("no");
        }
    }
}
