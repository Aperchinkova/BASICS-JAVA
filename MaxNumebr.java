import java.util.Scanner;

public class MaxNumebr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        int maxnumber=Integer.MIN_VALUE;
        while(!input.equals("Stop")){
            int number=Integer.parseInt(input);
            if(maxnumber<number){
                maxnumber=number;
            }
            input=scanner.nextLine();
        }
        System.out.println(maxnumber);
    }
}
