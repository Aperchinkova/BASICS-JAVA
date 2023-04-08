import java.util.Scanner;

public class movieTickets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String movie=scanner.nextLine();
        int countKid=0;
        int countStandard=0;
        int countStudent=0;
        int counter=0;

        while(!movie.equals("Finish")){

            int freeSeats=Integer.parseInt(scanner.nextLine());

            String input=scanner.nextLine();

            int currentCounter=0;

            while(!input.equals("End")){

                counter++;

                currentCounter++;

                switch(input){
                    case "student":
                        countStudent++;
                        break;

                    case "standard":
                        countStandard++;
                        break;

                    case "kid":
                        countKid++;
                        break;
                }

                if(currentCounter==freeSeats){
                    break;
                }
                input=scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n",movie,currentCounter*1.00/freeSeats*100);
            movie=scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n",counter);
        System.out.printf("%.2f%% student tickets.%n",countStudent*1.00/counter*100);
        System.out.printf("%.2f%% standard tickets.%n",countStandard*1.00/counter*100);
        System.out.printf("%.2f%% kids tickets.%n",countKid*1.00/counter*100);
    }
}
