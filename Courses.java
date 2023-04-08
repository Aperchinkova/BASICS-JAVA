package exrAssocoativeArrays;

import javax.xml.namespace.QName;
import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command= scanner.nextLine();
        Map<String,List<String>> courses=new LinkedHashMap<>();
        //Map<String,Integer> outputCourse=new LinkedHashMap<>();
        while(!command.equals("end"))
        {
            String course=command.split(" : ")[0];
            String name=command.split(" : ")[1];
            if(!courses.containsKey(course))
            {
                courses.put(course,new ArrayList<>());
            }
            courses.get(course).add(name);
            command= scanner.nextLine();
        }
        /*
        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue().size());
            entry.getValue().forEach(name-> System.out.println("-- "+name));
        }

         */
        courses.entrySet().stream()
                .sorted((e1,e2)->Integer.compare(e2.getValue().size(),e1.getValue().size()))
                .forEach(e->{
                            System.out.println(e.getKey()+": "+e.getValue().size());
                            e.getValue().stream()
                                    .sorted(String::compareTo)
                                    .forEach(student-> System.out.println("-- "+student));
                        }
                        );

    }
}
