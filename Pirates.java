package ExamPreparation30July;

import java.util.*;
import java.util.concurrent.TimeoutException;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command= scanner.nextLine();
        Map<String, List<Integer>> target=new LinkedHashMap<>();
        while(!command.equals("Sail"))
        {
            //Tortuga||345000||1250 -> {targeted cities}||{population}||{gold}
            String[] parts=command.split("\\|\\|");
            String city=parts[0];
            int population=Integer.parseInt(parts[1]);
            int gold=Integer.parseInt(parts[2]);

            if(!target.containsKey(city)){
                List<Integer> integers=new ArrayList<>();
                integers.add(population);
                integers.add(gold);
                target.put(city,integers);
            }else{
                List<Integer> increase=new ArrayList<>();
                int newP=target.get(city).get(0)+population;
                int newG=target.get(city).get(1)+gold;
                increase.add(newP);
                increase.add(newG);
                target.put(city,increase);
            }

            command= scanner.nextLine();
        }
        String text= scanner.nextLine();
        while(!text.equals("End"))
        {
            String[] parts=text.split("=>");
            String action=parts[0];
            String town=parts[1];
            switch (action)
            {
                case "Plunder":
                    //"Plunder=>{town}=>{people}=>{gold}"
                    int people=Integer.parseInt(parts[2]);
                    int gold=Integer.parseInt(parts[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);
                    int decreaseP=target.get(town).get(0)-people;
                    int decreaseG=target.get(town).get(1)-gold;
                    List<Integer> decrease=new ArrayList<>();

                    if(target.get(town).get(0)==0 && target.get(town).get(1)==0){
                        target.remove(town);
                        System.out.printf("%s has been wiped off the map!",town);
                    }else{
                        decrease.add(decreaseP,decreaseG);
                        target.replace(town,decrease);
                    }

                    break;
                case "Prosper":
                    /*
                    //"Prosper=>{town}=>{gold}"
                    int goldProsper=Integer.parseInt(parts[2]);

                    if(goldProsper<0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else{
                        int increaseGold=target.get(town).get(1)+goldProsper;
                        List<Integer> increase=new ArrayList<>();
                        increase.add(target.get(town).get(0));
                        increase.add(increaseGold);
                        target.replace(town,increase);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.",goldProsper,town,increaseGold);
                    }
                    break;

                     */
            }
            text= scanner.nextLine();
        }


    }
}
