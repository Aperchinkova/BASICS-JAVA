package excList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command=scanner.nextLine();
        while(!command.equals("End"))
        {
            String commandName=command.split(" ")[0];
            if(commandName.contains("Add"))
            {
                int addNumber=Integer.parseInt(command.split(" ")[1]);
                numList.add(addNumber);
            } else if (command.contains("Insert"))
            {
                int numberToInsert=Integer.parseInt(command.split(" ")[1]);
                int index=Integer.parseInt(command.split(" ")[2]);
                if(isIndexValid(index,numList))
                {
                    numList.add(index,numberToInsert);
                }else
                {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int removeIndex = Integer.parseInt(command.split(" ")[1]);
                if(isIndexValid(removeIndex,numList))
                {
                    numList.remove(removeIndex);
                }else
                {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int countsLeft=Integer.parseInt(command.split(" ")[2]);
                for(int index=0;index<countsLeft;index++)
                {
                    int firstNum=numList.get(0);
                    numList.add(firstNum);
                    numList.remove(numList.get((0)));
                }
            }else if(command.contains("Shift right"))
            {
                int countsRight=Integer.parseInt(command.split(" ")[2]);
                for(int index=0;index<countsRight;index++)
                {
                    int lastNumber=numList.get(numList.size()-1);
                    numList.add(0,lastNumber);
                    numList.remove(numList.size()-1);
                }
            }
            command=scanner.nextLine();
        }
        for (int number:numList)
        {
            System.out.print(number+" ");
        }
    }
    public static boolean isIndexValid(int index,List<Integer> list)
    {
        return index>=0 && index<=list.size()-1;
    }
}
