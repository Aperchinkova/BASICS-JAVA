package FINALEXAMSPREP;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Integer> exhibition=new LinkedHashMap<>();
        Map<String, List<Double>> plantRating=new LinkedHashMap<>();
        for(int i=0;i<n;i++)
        {
            String[] plants=scanner.nextLine().split("<->");
            String plant=plants[0];
            int rarity=Integer.parseInt(plants[1]);
            exhibition.compute(plant,(k,v)->rarity);
            plantRating.putIfAbsent(plant,new ArrayList<>());
        }
        String input= scanner.nextLine();
        while(!input.equals("Exhibition"))
        {
            String[] commands=input.split(": ");
            String command=commands[0];
            String[] plantAndSth=commands[1].split(" - ");
            String plant=plantAndSth[0];
            if(!exhibition.containsKey(plant))
            {
                System.out.println("error");
                continue;
            }

            switch (command)
            {
                case "Rate":
                    double rating=Double.parseDouble(plantAndSth[1]);
                    plantRating.get(plant).add(rating);
                    /*

                    rate.add(rating);
                    plantRating.put(plant,rate);\

                     */

                    /*
                    List<Double> rate=new ArrayList<>();
                    if(!plantRating.containsKey(plant))
                    {
                        rate.add(rating);
                        plantRating.put(plant,rate);
                    }else{
                        List<Double> renew=new ArrayList<>(plantRating.get(plant));
                        renew.add(rating);
                        plantRating.put(plant,renew);
                    }

                     */
                    break;
                case "Update":
                    int newRarity=Integer.parseInt(plantAndSth[1]);
                    /*
                    exhibition.put(plant,newRarity);

                     */
                    exhibition.compute(plant,(k,v)->newRarity);
                    break;
                case "Reset":
                    /*
                    plantRating.get(plant).clear();
                    List<Double> zero=new ArrayList<>();
                    zero.add(0.00);
                    plantRating.replace(plant,zero);
                     */
                    plantRating.get(plant).clear();
                    break;
                default:
                    System.out.println("error");
            }
            input= scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        /*
        for (Map.Entry<String, Integer> entry : exhibition.entrySet()) {
            double sizeRatingList=plantRating.get(entry.getKey()).size();
            double sum=0;
            for(int i=0;i<sizeRatingList;i++)
            {
                sum+=plantRating.get(entry.getKey()).get(i);
            }
            double averageSum=sum/sizeRatingList;

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",entry.getKey(),entry.getValue(),averageSum);
        }

         */
        exhibition.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue()
                        .thenComparingDouble(x->plantRating.get(x.getKey()).stream().mapToDouble(Double::doubleValue)
                                .average().orElse(0.0))
                        .reversed())
                .forEach(e-> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",e.getKey(),e.getValue(),plantRating.get(e.getKey()).stream().mapToDouble(Double::doubleValue).average().orElse(0.0)));

    }
}
