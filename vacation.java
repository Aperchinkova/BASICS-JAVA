import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double neededMoney=Double.parseDouble(scanner.nextLine());
        double savedMoney=Double.parseDouble(scanner.nextLine());

        int countDays=0;
        int spendDaysposledovatelno=0;

        while(savedMoney<neededMoney){
            if(spendDaysposledovatelno==5){//no 5 poredni!!
                break;
            }
            String action= scanner.nextLine();//spend or save
            double amount=Double.parseDouble(scanner.nextLine());//sumata koqto pesti ili harchi
            countDays++;//edin action na den

            if(action.equals("save")){//ako save->kum spestenite pari dobavqt vuvedenata suma;i zanulqvam spendDays shoto trqbva da sa mi poredni
                savedMoney+=amount;
                spendDaysposledovatelno=0;
            }else{//ako mi e spend!!->kum zanulenite spendDays se dobavq tekushtiqt den i ot savedMoney-vuvedenata izharchena suma
                spendDaysposledovatelno++;
                savedMoney-=amount;

                if(savedMoney<0){//akoo sme poharchili tolkova mnogo che sme ostanali bez pari to ne moje sumata da e otricatelno chislo a q priravnqvame kum 0
                    savedMoney=0;
                }
            }
        }
        if(spendDaysposledovatelno==5){//ako spend days mi sa 5 posledovatelni da pritnem
            System.out.println("You can't save the money.");
            System.out.println(countDays);//obshtiq broi dni v koito sme izvurshili dadenotot desitvie,toest harchene
        }else{//ako se reduvat spend i save
            System.out.printf("You saved the money for %d days.",countDays);
        }

    }
}
