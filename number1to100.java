import java.util.Scanner;

public class number1to100 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=n;i>=1;i--){
            //if (i != 5) {
                System.out.println(i);
            //}
        }
    }
}
