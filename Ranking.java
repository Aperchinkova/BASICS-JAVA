package MapsLambdaandStreamAPIMoreExercise;

import excArrays.MaxSequenceofEqualElements;
import methods.MathOperations;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        Map<String,String> contests=new LinkedHashMap<>();
        Map<String,Map<String,Integer>> users=new TreeMap<>();
        while(!input.equals("end of contests"))
        {
            String[] data=input.split(":");
            String contest=data[0];
            String password=data[1];
            contests.put(contest,password);
            input= scanner.nextLine();
        }
        String another= scanner.nextLine();
        while(!another.equals("end of submissions"))
        {
            String[] submission=another.split("=>");
            String contest=submission[0];
            String password=submission[1];
            String username=submission[2];
            int points=Integer.parseInt(submission[3]);

            if(contests.containsKey(contest))
            {
                if(contests.get(contest).equals(password))
                {
                    Map<String,Integer> course=new LinkedHashMap<>();
                    course.put(contest,points);

                    if(!users.containsKey(username))//ako map s mapa nqma imeto na uchastbika go dobavqme
                    {
                        users.put(username,course);
                    }else{//no ako map s mapa ima imeto na uchastnika

                        if(!users.get(username).containsKey(contest))
                        {
                            users.get(username).put(contest,points);
                        }else
                        {
                            users.get(username).put(contest,Math.max(points,users.get(username).get(contest)));
                        }
                    }
                }
            }




            another= scanner.nextLine();
        }
        int totalSum=0;
        for (Map.Entry<String, Map<String, Integer>> user : users.entrySet()) {
            int sum=user.getValue().values().stream().mapToInt(i->i).sum();
            if(sum>totalSum)
            {
                totalSum=sum;
            }
        }
        for (Map.Entry<String, Map<String, Integer>> user : users.entrySet()) {
            if(user.getValue().values().stream().mapToInt(i->i).sum()==totalSum)
            {
                System.out.printf("Best candidate is %s with total %d points.%n", user.getKey(), totalSum);
            }
        }
        System.out.println("Ranking:");
        users.forEach((key,value)->{
            System.out.printf("%s%n",key);
            value.entrySet().stream().sorted((f,s)->s.getValue()-f.getValue())
                    .forEach(i-> System.out.printf("#  %s -> %d%n",i.getKey(),i.getValue()));

        });
    }
}
