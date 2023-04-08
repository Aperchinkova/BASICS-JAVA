package excArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] numbers= Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for(int index=0;index<= numbers.length-1;index++)
        {
            int current=numbers[index];
            if(index== numbers.length-1)
            {
                System.out.print(current+" ");
            }
            boolean isTop=false;
            for(int i=index+1;i<= numbers.length-1;i++)
            {
                if(current> numbers[i])
                {
                    isTop=true;
                }else
                {
                    isTop=false;
                    break;
                }
            }
            if(isTop)
            {
                System.out.print(current+" ");
            }
        }


    }
}
