package exrAssocoativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        LinkedHashMap<String,List<String>> companies=new LinkedHashMap<>();

        while (!input.equals("End")) {
            String [] data = input.split(" -> ");
            if(companies.containsKey(data[0])) {
                List<String> employees = companies.get(data[0]);
                if (!employees.contains(data[1]))
                    employees.add(data[1]);
            } else  {
                List<String> employees = new ArrayList<>();
                employees.add(data[1]);
                companies.put(data[0], employees);
            }
            input = scanner.nextLine();
        }
        /*
        for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
            System.out.printf("%s%n-- %s%n",entry.getKey(),String.join("\n-- ",entry.getValue()));
        }

         */
        for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
            System.out.printf("%s%n",entry.getKey());
            for (String ID:companies.get(entry.getKey())){
                System.out.printf("-- %s%n",ID);
            }
        }


    }
}
