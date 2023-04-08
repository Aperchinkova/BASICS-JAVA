package ExamPreparation30July;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pirates2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        Map<String,int[]> towns=new LinkedHashMap<>();
        while(!input.equals("Sail")){
            String[] town=input.split("\\|\\|");
            towns.putIfAbsent(town[0],new int[2]);
            towns.get(town[0])[0]+=Integer.parseInt(town[1]);
            towns.get(town[0])[1]+=Integer.parseInt(town[2]);
            input= scanner.nextLine();
        }
        while(!input.equals("End"))
        {
            String[] command=input.split("=>");
            switch (command[0])
            {
                case "Plunder":
                    //Plunder=>{town}=>{people}=>{gold}"
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",command[1],Integer.parseInt(command[3]),Integer.parseInt(command[2]));
                    towns.get(command[1])[0]-=Integer.parseInt(command[2]);
                    towns.get(command[1])[1]-=Integer.parseInt(command[3]);
                    if(towns.get(command[1])[0]==0 || towns.get(command[1])[1]==0)
                    {
                        towns.remove(command[1]);
                        System.out.printf("%s has been wiped off the map!%n",command[1]);
                    }
                    break;
                case "Prosper":
                    //Prosper=>{town}=>{gold}
                    if(Integer.parseInt(command[2])<0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else
                    {
                        towns.get(command[1])[1]+=Integer.parseInt(command[2]);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",Integer.parseInt(command[2]),command[1],towns.get(command[1])[1]);
                    }
                    break;
            }
            input= scanner.nextLine();
        }
        if(towns.isEmpty())
        {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else{
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",towns.size());
            for (Map.Entry<String, int[]> entry : towns.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",entry.getKey(),entry.getValue()[0],entry.getValue()[1]);
            }
        }
    }
}
