package exrMethod;

import java.util.Scanner;

public class CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char first=scanner.nextLine().charAt(0);
        char second=scanner.nextLine().charAt(0);
        between(first,second);
    }
    public static void between(char symbol1,char symbol2)
    {
        if(symbol1<symbol2){
            for(char i=(char)(symbol1+1);i<symbol2;i++)
            {
                System.out.print(i+" ");
            }
        }else
        {
            for(char i=(char)(symbol2+1);i<symbol1;i++)
            {
                System.out.print(i+" ");
            }
        }


    }
}
