package excArrays;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String first=scanner.nextLine();
        String second=scanner.nextLine();
        String[] firstArr=first.split(" ");
        String[] secondArr=second.split(" ");
        for(String secondArrEl: secondArr)
        {
            for(String firstArrEl:firstArr)
            {
                if(firstArrEl.equals(secondArrEl))
                {
                    System.out.print(firstArrEl+" ");
                }
            }
        }
    }
}
