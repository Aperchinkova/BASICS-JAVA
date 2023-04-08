import java.util.Scanner;

public class zoo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int foodForDogs=Integer.parseInt(scanner.nextLine());
        int foodForCats=Integer.parseInt(scanner.nextLine());
        double sum=foodForDogs*2.50+foodForCats*4.00;
        System.out.println("The sum is:"+sum+" lv");


    }
}
