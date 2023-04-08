package EXAM;

import java.sql.ClientInfoStatus;
import java.util.*;

public class DegustationParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Map<String, List<String>> like=new LinkedHashMap<>();
        int unliked=0;
        while(!input.equals("Stop"))
        {
            String[] parts=input.split("-");
            String command=parts[0];
            String guest=parts[1];
            String meal=parts[2];
            switch (command)
            {
                case "Like":
                    if(!like.containsKey(guest))
                    {
                        List<String> meals=new ArrayList<>();
                        meals.add(meal);
                        like.putIfAbsent(guest,meals);
                    }else{
                        if(like.get(guest).contains(meal))
                        {
                            break;
                        }
                        //List<String> meals=new ArrayList<>();
                        like.get(guest).add(meal);

                    }
                    break;
                case "Dislike":
                    /*
                    if(!like.containsKey(guest))
                    {
                        System.out.printf("%s is not at the party.%n",guest);
                        break;
                    }else if(like.containsKey(guest)){
                        unliked++;
                        System.out.printf("%s doesn't like the %s.%n",guest,meal);

                    }
                    if (!like.get(guest).contains(meal))
                    {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n",guest,meal);
                    }else if(like.get(guest).contains(meal)){//znachi go ima
                        unliked++;

                        if(like.get(guest).contains(meal))
                        {
                            like.get(guest).remove(meal);
                        }
                        List<String> removed=like.get(guest);
                        System.out.printf("%s doesn't like the %s.%n",guest,removed);
                    }

                     */
                    if(!like.containsKey(guest))
                    {
                        System.out.printf("%s is not at the party.%n",guest);
                    }else if(!like.get(guest).contains(meal))
                    {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n",guest,meal);
                    }else {
                        unliked++;

                        System.out.printf("%s doesn't like the %s.%n",guest,String.join("",like.get(guest)));
                        like.get(guest).remove(meal);

                    }


                    break;

            }
            input= scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : like.entrySet()) {
            String result=String.join(", ",entry.getValue());
            System.out.printf("%s: %s%n",entry.getKey(),result);
        }

        System.out.println("Unliked meals: "+unliked);
    }
}
