import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean flag=false;
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10; j++) {
                int result=i*j;
                System.out.printf("%d * %d = %d%n",i,j,result);
                if(j==5){
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }

        }
    }
}
