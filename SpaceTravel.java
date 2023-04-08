package midExam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //String[] travelRoutToTitan=scanner.nextLine().split(Pattern.quote("||"));
        String[] travelRoutToTitan=scanner.nextLine().split("\\|\\|");
        int startingFuel=Integer.parseInt(scanner.nextLine());
        int startingAmmunition=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<travelRoutToTitan.length;i++)
        {
            String[] route=travelRoutToTitan[i].split(" ");
            String command=route[0];
            boolean fightOrRun=false;
            switch (command)
            {
                //Travel 10
                case "Travel":
                    int element=Integer.parseInt(route[1]);
                    for(int years=0;years<element;years++)
                    {
                        startingFuel-=1;
                    }
                    if(startingFuel>=0)
                    {
                        System.out.printf("The spaceship travelled %d light-years.%n",element);
                    }else
                    {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                //Enemy 30
                case "Enemy":
                    int el=Integer.parseInt(route[1]);
                    if (startingAmmunition>=el)
                    {
                        fightOrRun=true;
                        for(int round=0;round<el;round++)
                        {
                            startingAmmunition-=1;
                        }

                        System.out.printf("An enemy with %d armour is defeated.%n",el);
                    }else {

                        for(int point=0;point<el;point++)
                        {
                            startingFuel=startingFuel-2;
                        }


                        if(startingFuel>=el)
                        {
                            fightOrRun=true;
                            System.out.printf("An enemy with %d armour is outmaneuvered.%n",el);
                        }

                    }
                    if(!fightOrRun)
                    {
                        System.out.println("Mission failed.");
                        return;
                    }

                    break;
                    //Repair 15

                case "Repair":
                    int ele=Integer.parseInt(route[1]);
                    startingFuel+=ele;
                    //int addedFuel=startingFuel+ele;
                    int addedAmmunitions=ele*2;
                    startingAmmunition+=addedAmmunitions;
                    System.out.printf("Ammunitions added: %d.%n",addedAmmunitions);
                    System.out.printf("Fuel added: %d.%n",ele);
                    break;

                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
                    return;
            }
        }
    }
}