import java.util.Scanner;

public class trainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numOfJure=Integer.parseInt(scanner.nextLine());//
        String presentationName=scanner.nextLine();
        double average=0;
        int numOfMarks=0;
        int marksCount=0;
        double total=0;

        while(!presentationName.equals("Finish")){
            while(numOfMarks<=numOfJure){
                double Marks=Double.parseDouble(scanner.nextLine());
                average+=Marks/(numOfJure*1.00);
                numOfMarks++;
                marksCount++;

                if(numOfJure==numOfMarks){
                    System.out.printf("%s - %.2f.%n",presentationName,average);
                    numOfMarks=0;
                    average=0;
                    break;
                }
                total=+average;
            }
            presentationName= scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.%n",total);
    }
}
