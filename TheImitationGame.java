package ExamPreparation30July;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String encrypted= scanner.nextLine();
        String input=scanner.nextLine();
        while (!input.equals("Decode"))
        {
            String[] instr=input.split("\\|");
            String command=instr[0];
            switch (command)
            {
                case "Move":
                    int numOfLetters=Integer.parseInt(instr[1]);
                    String firstPart=encrypted.substring(0,numOfLetters);
                    String secondPart=encrypted.substring(numOfLetters);
                    encrypted=secondPart.concat(firstPart);
                   // encrypted=encrypted.replace(sub,"")+sub;
                    break;
                case "Insert":
                    int index=Integer.parseInt(instr[1]);
                    String value=instr[2];
                    //encrypted=encrypted.substring(0,index)+value+encrypted.substring(index);
                    String firstP=encrypted.substring(0,index);
                    String secondP=encrypted.substring(index);
                    encrypted=firstP.concat(value).concat(secondP);
                    break;
                case "ChangeAll":
                    String substring=instr[1];
                    String replacement=instr[2];
                    encrypted=encrypted.replace(substring,replacement);
                    break;
            }
            input= scanner.nextLine();
        }
        System.out.println("The decrypted message is: "+encrypted);
   }
}
