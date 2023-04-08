package ObjectsandClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students20 {
        static class Student
        {
            String firstName;
            String lastName;
            String age;
            String town;
            public Student(String firstName,String lastName,String age,String town)
            {
                this.firstName=firstName;
                this.lastName=lastName;
                this.age=age;
                this.town=town;
            }
            public String getFirstName()
            {
                return this.firstName;
            }
            public String getLastName()
            {
                return this.lastName;
            }
            public String getAge()
            {
                return this.age;
            }
            public String getTown()
            {
                return this.town;
            }
        }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Student> students=new ArrayList<>();
        String input= scanner.nextLine();
        while(!input.equals("end"))
        {
            String[] inputStudentArr=input.split(" ");
            String firstName=inputStudentArr[0];
            String lastName=inputStudentArr[1];
            String age=inputStudentArr[2];
            String town=inputStudentArr[3];
            if(isStudentExisting(students,firstName,lastName))
            {
                Student student=getStudent(students,firstName,lastName,age,town);
            }else
            {
                Student student=new Student(firstName,lastName,age,town);
                students.add(student);
            }
            input= scanner.nextLine();
        }
        String filterCity= scanner.nextLine();
        students.stream()
                .filter(s->s.getTown().equals(filterCity))
                .forEach(s-> System.out.println(String.format("%s %s is %d years old",s.firstName,s.lastName,s.age)));
    }
    private static boolean isStudentExisting(List<Student> students,String firstName,String lastName)
    {
        for (Student student:students)
        {
            if(student.getFirstName().equals(firstName) && student.lastName.equals(lastName))
            {
                return true;
            }
        }
        return false;
    }
    private static Student getStudent(List<Student> students,String firstName,String lastName,String age,String town)
    {
        Student existingStudent=null;
        for (Student student:students)
        {
            if(student.getFirstName().equals(firstName) && student.lastName.equals(lastName))
            {
                existingStudent=student;
                existingStudent.age=age;
                existingStudent.town=town;
            }
        }
        return existingStudent;
    }
}
