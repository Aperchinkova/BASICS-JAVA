package exrAssocoativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command= scanner.nextLine();
        Map<String,Integer> commandsList=new LinkedHashMap<>();
        while(!command.equals("stop"))
        {
            int quantity=Integer.parseInt(scanner.nextLine());
            if (!commandsList.containsKey(command))
            {
                commandsList.put(command,quantity);
            }else
            {
                int currentQuantity=commandsList.get(command);
                commandsList.put(command,currentQuantity+quantity);
            }
            command= scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : commandsList.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
