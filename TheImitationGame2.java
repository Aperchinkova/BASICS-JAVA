package FINALEXAMSPREP;

import java.util.Scanner;

public class TheImitationGame2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String encrypted= scanner.nextLine();
        String input= scanner.nextLine();
        while(!input.equals("Decode"))
        {
            String[] parts=input.split("\\|");
            String command=parts[0];
            switch (command)
            {
                case "Move":
                    int numOfLetters=Integer.parseInt(parts[1]);
                    String move=encrypted.substring(0,numOfLetters);
                    encrypted=encrypted.replace(move,"")+move;
                    break;
                case "Insert":
                    int index=Integer.parseInt(parts[1]);
                    String value=parts[2];
                    String firstPart=encrypted.substring(0,index);
                    String secondPart=encrypted.substring(index);
                    encrypted=firstPart.concat(value).concat(secondPart);
                   // encrypted=encrypted.substring(0,index+1)+value+encrypted.substring(index,encrypted.length());
                    break;
                case "ChangeAll":
                    String substring=parts[1];
                    String substring1=parts[2];
                    encrypted=encrypted.replaceAll(substring,substring1);
                    break;
            }
            input= scanner.nextLine();
        }
        System.out.println("The decrypt message is: "+ encrypted);
    }
}
