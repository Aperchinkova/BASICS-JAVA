package list;

import java.util.*;

public class RemoveNegativesandReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();
        numList.removeIf(e -> e<0);
        if(numList.isEmpty())
        {
            System.out.println("empty");
        }else
        {
            Collections.reverse(numList);
            System.out.println(numList.toString().replaceAll("[\\[\\],]",""));
        }


    }
}
