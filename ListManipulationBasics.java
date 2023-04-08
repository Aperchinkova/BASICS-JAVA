package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input=scanner.nextLine();
        while(!input.equals("end"))
        {
            List<String> commandLine=Arrays
                    .stream(input.split(" "))
                    .collect(Collectors.toList());
            String command=commandLine.get(0);
            int number=0;
            int index=0;
            switch(command)
            {
                case "Add":
                    number=Integer.parseInt(commandLine.get(1));
                    numList.add(number);
                    break;
                case "Remove":
                    number=Integer.parseInt(commandLine.get(1));
                    numList.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    index=Integer.parseInt(commandLine.get(1));
                    numList.remove(index);
                    break;
                case "Insert":
                    number=Integer.parseInt(commandLine.get(1));
                    index=Integer.parseInt(commandLine.get(2));
                    numList.add(index,number);
                    break;

            }
            input=scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]",""));
    }
}
