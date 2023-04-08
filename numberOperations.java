import java.util.Scanner;

public class numberOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n1=Integer.parseInt(scanner.nextLine());
        int n2=Integer.parseInt(scanner.nextLine());
        String operator= scanner.nextLine();
        double result=0;


        switch(operator){
            case "+":
                result=n1+n2;
                if(result%2==0){
                    System.out.printf("%.0f - even",result);
                }else{
                    System.out.printf("%.0f - odd",result);
                }
                break;
            case "-":
                result=n1-n2;
                if(result%2==0){
                    System.out.printf("%.0f - even",result);
                }else{
                    System.out.printf("%.0f - odd",result);
                }
                break;
            case "*":
                result=n1*n2;
                if(result%2==0){
                    System.out.printf("%.0f - even",result);
                }else{
                    System.out.printf("%.0f - odd",result);
                }
                break;
            case "/":
                result=n1/n2;
                if(n2!=0){
                    System.out.printf("%.2f",result);
                }else{
                    System.out.printf("Cannot devide %d by 0",n1);
                }
                break;
            case "%":
                result=n1%n2;
                if(n2==0){
                    System.out.printf("Cannot devide %d by 0",n1);
                }else{
                    System.out.printf("%.0f",result);
                }
                break;
        }
    }
}
