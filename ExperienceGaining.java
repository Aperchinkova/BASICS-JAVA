package midExam;

import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double amountOfExperience=Double.parseDouble(scanner.nextLine());
        int countOfBattles=Integer.parseInt(scanner.nextLine());
        double sum=0;
        int count=0;
        for(int i=1;i<=countOfBattles;i++)
        {
            double experienceEarnedPerBattle=Double.parseDouble(scanner.nextLine());
            if(i%3==0)
            {
                experienceEarnedPerBattle=(experienceEarnedPerBattle+(experienceEarnedPerBattle*0.15));
            }else if(i%5==0)
            {
                experienceEarnedPerBattle=(experienceEarnedPerBattle-(experienceEarnedPerBattle*0.1));
            }

            sum+=experienceEarnedPerBattle;
            count++;
            if(sum>=amountOfExperience)
            {
                break;
            }

        }
        if(sum>=amountOfExperience)
        {
            System.out.printf("Player successfully collected his needed experience for %d battles.",count);

        }else {

            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.",amountOfExperience-sum);
        }
    }
}
