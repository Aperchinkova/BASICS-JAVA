package exerciseBasicSyntax;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username=scanner.nextLine();
        String password="";
        int count=0;
        for(int position=username.length()-1;position>=0;position--)
        {
            char symbol=username.charAt(position);
            password+=symbol;

        }
        String enteredPassword=scanner.nextLine();
        while(!enteredPassword.equals(password))
        {
            count++;
            if(count==4)
            {
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            enteredPassword=scanner.nextLine();
        }
        if(enteredPassword.equals(password))
        {
            System.out.printf("User %s logged in.",username);
        }

    }
}
