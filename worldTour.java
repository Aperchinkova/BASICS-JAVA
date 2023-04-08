package FINALEXAMSPREP;

import java.util.Scanner;

public class worldTour {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        StringBuilder builder=new StringBuilder(text);
        String input= scanner.nextLine();
       // StringBuilder sb=new StringBuilder(input);
        while(!input.equals("Travel"))
        {
            String[] stops=input.split(":");
            String command=stops[0];
            switch (command)
            {
                case "Add Stop":
                    int index=Integer.parseInt(stops[1]);
                    String string=stops[2];
                    if(isValid(builder,index))
                    {
                        builder.insert(index,string);
                    }


                    break;
                case "Remove Stop":
                    int startIndex=Integer.parseInt(stops[1]);
                    int endIndex=Integer.parseInt(stops[2]);
                    if(isValid(builder,startIndex)&&isValid(builder,endIndex))
                    {
                        builder.delete(startIndex,endIndex+1);
                    }

                    break;
                case "Switch":
                    String oldString=stops[1];
                    String newString=stops[2];
                    if(text.contains(oldString))
                    {
                        String update=builder.toString().replace(oldString,newString);
                        builder=new StringBuilder(update);
                    }

                    break;
            }
            System.out.println(builder);
            input= scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: "+builder);
    }
    private static boolean isValid(StringBuilder builder,int index)
    {
        return index>=0 && index<=builder.length()-1;
    }
}
