package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listOfphones = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")){
            List<String> commandLine = Arrays.stream(input.split(" - "))
                    .collect(Collectors.toList());

            String command = commandLine.get(0);

            String TypeOfPhone = commandLine.get(1);

            switch (command){
                case "Add":
                    if(!listOfphones.contains(TypeOfPhone)){
                        listOfphones.add(TypeOfPhone);
                    }
                    break;
                case "Remove":
                    if(listOfphones.contains(TypeOfPhone)){
                        listOfphones.remove(TypeOfPhone);
                    }
                    break;
                case "Bonus phone":
                    List<String> oldAndNewPhone = Arrays.stream(commandLine.get(1).split(":"))
                            .collect(Collectors.toList());
                    String oldPhone = oldAndNewPhone.get(0);
                    String newPhone = oldAndNewPhone.get(1);
                    if(listOfphones.contains(oldPhone)){
                        int index = listOfphones.indexOf(oldPhone);
                        listOfphones.add(index+1,newPhone);
                    }
                    break;
                case "Last":
                    if(listOfphones.contains(TypeOfPhone)){
                        String currentPhoneType = TypeOfPhone;
                        listOfphones.remove(TypeOfPhone);
                        listOfphones.add(currentPhoneType);
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        for (int i = 0; i < listOfphones.size() ; i++) {
            if(i== listOfphones.size()-1){
                System.out.print(listOfphones.get(i) + " ");
            }else{
                System.out.print(listOfphones.get(i) + ", ");
            }
        }
    }
}
