package exrAssocoativeArrays;

import methods.MathOperations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,String> parkingUsers=new LinkedHashMap<>();
        for (int i=0;i<n;i++)
        {
            String[] input=scanner.nextLine().split(" ");
            String command=input[0];
            String userName=input[1];
            switch (command)
            {
                case "register":
                    String licensePlateNumber=input[2];
                    if(!parkingUsers.containsKey(userName))
                    {
                        parkingUsers.put(userName,licensePlateNumber);
                        System.out.println(userName+" registered "+licensePlateNumber+" successfully");
                    }else
                    {
                        System.out.println("ERROR: already registered with plate number "+licensePlateNumber);
                    }
                    break;
                case "unregister":
                    if (!parkingUsers.containsKey(userName))
                    {
                        System.out.println("ERROR: user " + userName + " not found");
                    }else
                    {
                        parkingUsers.remove(userName);
                        System.out.println(userName+" unregistered successfully");
                    }
                    break;
            }
        }
        parkingUsers.forEach((userName,licensePlateNumber)-> System.out.println(userName+" => "+licensePlateNumber));

    }
}
