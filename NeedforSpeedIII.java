package ExamPreparation30July;

import java.util.*;

public class NeedforSpeedIII {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,List<Integer>> cars=new LinkedHashMap<>();
        for (int i=0;i<n;i++)
        {
            String[] carInfo=scanner.nextLine().split("\\|");
            String car=carInfo[0];
            int mileage=Integer.parseInt(carInfo[1]);
            int fuel=Integer.parseInt(carInfo[2]);
            cars.putIfAbsent(car,new ArrayList<>());
            cars.get(car).add(0,mileage);
            cars.get(car).add(1,fuel);
        }
        String input= scanner.nextLine();
        while(!input.equals("Stop"))
        {
            String[] info=input.split(" : ");
            String command=info[0];
            String car=info[1];
            int mileage=cars.get(car).get(0);
            int fuel=cars.get(car).get(1);

            if(command.equals("Drive"))
            {
                //Drive : {car} : {distance} : {fuel}
                int distance=Integer.parseInt(info[2]);
                int consumedFuel=Integer.parseInt(info[3]);
                if(fuel>=consumedFuel)
                {
                    cars.get(car).set(0,mileage+distance);
                    cars.get(car).set(1,fuel-consumedFuel);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,consumedFuel);
                }else{
                    System.out.println("Not enough fuel to make that ride");
                }
                if(mileage+distance>=100000){
                    System.out.printf("Time to sell the %s!%n",car);
                    cars.remove(car);
                }
            }else if(command.equals("Refuel"))
            {
                //Refuel : {car} : {fuel}
                int refillFuel=Integer.parseInt(info[2]);
                int totalFuel=fuel+refillFuel;
                int diff=0;
                if(totalFuel>75)
                {
                    diff=75-fuel;
                    totalFuel=75;
                }else{
                    diff=refillFuel;
                }
                cars.get(car).set(1,totalFuel);
                System.out.printf("%s refueled with %d liters%n",car,diff);
            }else if(command.equals("Revert"))
            {
                //Revert : {car} : {kilometers}
                int km=Integer.parseInt(info[2]);
                int totalMileage=mileage-km;
                if(totalMileage<10000)
                {
                    totalMileage=10000;
                }else{
                    System.out.printf("%s mileage decreased by %d kilometers%n",car,km);
                }
                cars.get(car).set(0,totalMileage);
            }
            input= scanner.nextLine();
        }
        /*
        for (Map.Entry<String, List<Integer>> entry : cars.entrySet()) {
             String car = entry.getKey();
             int mileage = entry.getValue().get(0);
             int fuel = entry.getValue().get(1);

             System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", car, mileage, fuel);


   }
*/
        cars.forEach((key, value) ->
                System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                        key, value.get(0), value.get(1)));
    }
}
