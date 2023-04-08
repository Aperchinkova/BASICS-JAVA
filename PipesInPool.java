import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int volume=Integer.parseInt(scanner.nextLine());
        int p1=Integer.parseInt(scanner.nextLine());
        int p2=Integer.parseInt(scanner.nextLine());
        double h=Double.parseDouble(scanner.nextLine());

        double p1volume=h*p1;
        double p2volume=h*p2;
        double total=p1volume+p2volume;
        if(total<volume){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%." +
                    " Pipe 2: %.2f%%.",total/10,(p1volume/total)*100,(p2volume/total)*100);
        }
        else if(total>volume){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h,total-volume);
        }
    }
}
