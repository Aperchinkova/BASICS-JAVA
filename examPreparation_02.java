import java.util.Scanner;

public class examPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //broi nezadovolitelni ocenki
        int failedThreshold=Integer.parseInt(scanner.nextLine());

        //kolko puti e poluchil slaba ocenka pod ili ravna na 4
        int failedTimes=0;
        //resheni zadachi
        int solvedProblemCount=0;
        //sumata na vischki dobri ocenki i na loshite sushto ako sa pod dopustimite broiki za loshi ocenki
        double gradesSum=0;
        //imeto na vuvedenata posledna zadacha s purvonachalna stoinost prazen tekst
        String lastProblem="";
        //buleva stoinost za dali se e provalil ili ne,purvonachalnata stoinost e neproval
        boolean isFailed=true;

        //produljava dokato broqt na nezadovolitelnite ocenki e po-maluk ot chislotot za tqh koeto sme vuveli
        while(failedTimes<failedThreshold){
            //mnogokratno se chete ime na zadacha
            String problemName=scanner.nextLine();

            if(problemName.equals("Enough")){
                isFailed=false;

                break;
            }

            //mnogokratno se chete ocenka
            int grade=Integer.parseInt(scanner.nextLine());

            if(grade<=4){
                failedTimes++;
            }
            gradesSum+=grade;
            solvedProblemCount++;
            lastProblem=problemName;
        }

        if(isFailed) {
            System.out.printf("You need a break, %d poor grades.", failedThreshold);
        }else{
            System.out.printf("Average score: %.2f%n",gradesSum/solvedProblemCount);
            System.out.printf("Number of problems: %d%n",solvedProblemCount);
            System.out.printf("Last problem: %s",lastProblem);
        }
    }
}
