package ExamPreparation30July;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String message= scanner.nextLine();
        String input= scanner.nextLine();
        while(!input.equals("Reveal"))
        {
            String[] task=input.split(":\\|:");
            String command=task[0];
            switch (command)
            {
                case "ChangeAll":
                    //ChangeAll:|:{substring}:|:{replacement}":
                    String substring=task[1];
                    String replacement=task[2];
                    message=message.replace(substring,replacement);
                    System.out.println(message);
                    break;
                case "InsertSpace":
                    //InsertSpace:|:{index}":
                    int index=Integer.parseInt(task[1]);
                    message=message.substring(0,index)+" "+message.substring(index,message.length());
                    System.out.println(message);
                    break;
                case "Reverse":
                    //Reverse:|:{substring}
                    String text=task[1];
                    if(message.contains(text))
                    {
                        String forReverse=new StringBuilder(text).reverse().toString();
                        message=message.replaceFirst(Pattern.quote(text),"")+forReverse;
                        System.out.println(message);
                    }else{
                        System.out.println("error");
                    }
                    break;
            }
            input= scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",message);
    }
}
