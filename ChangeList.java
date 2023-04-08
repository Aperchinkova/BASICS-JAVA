package excList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine() //"1 2 3 4 5 5 5 6"
                        .split(" ")) //["1", "2", "3", "4", "5", "5", "5", "6"]
                .map(Integer::parseInt) //[1, 2, 3, 4, 5, 5, 5, 6]
                .collect(Collectors.toList()); //{1, 2, 3, 4, 5, 5, 5, 6}
        String input=scanner.nextLine();
        while(!input.equals("end"))
        {
            String commandName=input.split(" ")[0];
            int element=Integer.parseInt(input.split(" ")[1]);
            if(commandName.equals("Delete"))
            {
                numList.removeAll(Arrays.asList(element));
            }else if(commandName.equals("Insert"))
            {
                int index=Integer.parseInt(input.split(" ")[2]);
                numList.add(index,element);
            }
            input=scanner.nextLine();
        }
        for(int num:numList)
        {
            System.out.print(num+" ");
        }

    }
}
