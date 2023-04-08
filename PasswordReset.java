package ExamPreparation30July;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        String input= scanner.nextLine();
        while(!input.equals("Done"))
        {
            String[] commands=input.split(" ");
            String command=commands[0];
            switch (command)
            {
                case "TakeOdd":
                    int len=text.length();
                    String newText="";
                    for(int i=0;i<len;i++)
                    {
                        if(i%2!=0)
                        {
                            char symbol=text.charAt(i);
                            newText=newText.concat(symbol+"");
                        }
                    }
                    text=newText;
                    System.out.println(text);
                    break;
                case "Cut":
                    int index=Integer.parseInt(commands[1]);
                    int length=Integer.parseInt(commands[2]);
                    String substring=text.substring(index,index+length);
                    text=text.replaceFirst(substring,"");
                    System.out.println(text);
                    break;
                case "Substitute":
                    String sub=commands[1];
                    String substitute=commands[2];
                    if(text.contains(sub))
                    {
                        text=text.replaceAll(sub,substitute);
                        System.out.println(text);
                    }else{
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input= scanner.nextLine();
        }
        System.out.println("Your password is: "+text);
    }
}
