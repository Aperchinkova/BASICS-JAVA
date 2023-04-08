import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        boolean flag=false;

        int number=Integer.parseInt(scanner.nextLine());

        int currentNumber=0;

        for (int rows = 1; rows <=number ; rows++) {

            for (int col = 1; col <=rows ; col++) {
                currentNumber++;
                if(currentNumber>number){
                    flag=true;
                    break;
                }
                System.out.print(currentNumber + " ");
            }
            if(flag){
                break;
            }
            System.out.println();
        }
    }
}
