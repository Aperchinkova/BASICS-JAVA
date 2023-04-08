package midExam;

import javax.swing.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shopPhone {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> listOfPhones=Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input=scanner.nextLine();

        while(!input.equals("End"))
        {
            List<String> commandLine=Arrays.stream(input.split(" - ")).collect(Collectors.toList());
            String command=commandLine.get(0);
            String typeOfPhone=commandLine.get(1);
            switch (command)
            {
                case "Add":
                    if(listOfPhones.contains(typeOfPhone))
                    {
                        break;
                    }else{
                        listOfPhones.add(typeOfPhone);
                    }
                    break;
                case "Remove":
                    if(listOfPhones.contains(typeOfPhone))
                    {
                        listOfPhones.remove(typeOfPhone);
                    }
                    break;
                case "Bonus phone":
                    List<String> twoPhones=Arrays.stream(typeOfPhone.split(":")).collect(Collectors.toList());
                    String firstPhone=twoPhones.get(0);
                    String secondPhone=twoPhones.get(1);
                    if(listOfPhones.contains(firstPhone))
                    {
                        int firstIndex=listOfPhones.indexOf(firstPhone);
                        listOfPhones.add(firstIndex+1,secondPhone);
                    }
                    break;
                case "Last":
                    if(listOfPhones.contains(typeOfPhone))
                    {
                        String currentPhone=typeOfPhone;
                        listOfPhones.remove(typeOfPhone);
                        listOfPhones.add(currentPhone);
                    }
                    break;
            }
            input=scanner.nextLine();
        }
        for (String element:listOfPhones) {
            System.out.print(element+", ");
        }
    }
}
