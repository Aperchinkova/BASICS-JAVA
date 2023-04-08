package list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> first= Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> second=Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> resultList=new ArrayList();
        int minSize=Math.min(first.size(),second.size());
        for(int i=0;i<minSize;i++)
        {
            int firstItem=first.get(i);
            int secondItem=second.get(i);

            resultList.add(firstItem);
            resultList.add(secondItem);
        }
        if(first.size()>second.size())
        {
            resultList.addAll(first.subList(minSize, first.size()));
        }else
        {
            resultList.addAll(second.subList(minSize,second.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]",""));
    }
}
