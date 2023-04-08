import java.util.Scanner;

public class trainTheTrainersEditedByRalson {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numOfJures=Integer.parseInt(scanner.nextLine());
        String presentationName= scanner.nextLine();
        double average=0;
        double sumOfMarks=0;
        double sumOfMarks1=0;
        int gradesCounter=0;
        double total=0;
        while(!presentationName.equals("Finish")){
            for(int i=1;i<=numOfJures;i++){
                double marks=Double.parseDouble(scanner.nextLine());
                sumOfMarks+=marks;
                gradesCounter++;
            }
            sumOfMarks1=sumOfMarks1+sumOfMarks;
            average=sumOfMarks/numOfJures;
            System.out.printf("%s - %.2f.%n",presentationName,average);
            sumOfMarks=0;
            average=0;

            presentationName= scanner.nextLine();
        }
        double totalGrade=sumOfMarks1/gradesCounter;
        System.out.printf("Student's final assessments is %.2f",totalGrade);
    }
}
